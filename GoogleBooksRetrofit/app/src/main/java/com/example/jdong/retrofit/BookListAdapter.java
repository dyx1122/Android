package com.example.jdong.retrofit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jdong on 11/30/17.
 */

public class BookListAdapter extends Adapter {

  private static final int VIEW_TYPE_BOOK = 1;
  private static final int VIEW_TYPE_LOADING = 2;

  private List<Book> bookList;
  private LoadMoreListener loadMoreListener;
  private boolean showLoading;
  private Context context;

  public BookListAdapter(List<Book> data, LoadMoreListener loadMoreListener, Context context) {
    this.bookList = data;
    this.loadMoreListener = loadMoreListener;
    this.showLoading = true;
    this.context = context;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    if (viewType == VIEW_TYPE_BOOK) {
      View view = LayoutInflater.from(parent.getContext())
              .inflate(R.layout.fragment_booklist, parent, false);
      return new BookViewHolder(view);
    } else {
      View view = LayoutInflater.from(parent.getContext())
              .inflate(R.layout.list_item_loading, parent, false);
      return new RecyclerView.ViewHolder(view) {};
    }
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    final int viewType = getItemViewType(position);
    if (viewType == VIEW_TYPE_LOADING) {
      loadMoreListener.onLoadMore();
    } else {


      BookViewHolder bookholder = (BookViewHolder) holder;
      bookholder.mItem = bookList.get(position);
      bookholder.mTitleView.setText(bookList.get(position).getVolumeInfo().getTitle());
      String authorsString = "by " + bookList.get(position).getVolumeInfo().getAuthors();
      bookholder.mAuthorsView.setText(authorsString);
      String smallThumbnailLink = bookList.get(position).getVolumeInfo().getImageLinks().getSmallThumbnail();
      Picasso.with(context).load(smallThumbnailLink).into(bookholder.mBookCoverView);

    }
  }

  @Override
  public int getItemCount() {
    return showLoading ? bookList.size() + 1 : bookList.size();
  }

  @Override
  public int getItemViewType(int position) {
    return position < bookList.size()
            ? VIEW_TYPE_BOOK
            : VIEW_TYPE_LOADING;
  }

  public void append(List<Book> moreShots) {
    bookList.addAll(moreShots);
    notifyDataSetChanged();
  }

  public int getDataCount() {
    return bookList.size();
  }

  public interface LoadMoreListener {
    void onLoadMore();
  }

  public void setShowLoading(boolean showLoading) {
    this.showLoading = showLoading;
    notifyDataSetChanged();
  }

  static class BookViewHolder extends RecyclerView.ViewHolder {
    public final TextView mTitleView;
    public final TextView mAuthorsView;
    public final ImageView mBookCoverView;
    public Book mItem;

    public BookViewHolder(View view) {
      super(view);
      mTitleView = (TextView) view.findViewById(R.id.title);
      mAuthorsView = (TextView) view.findViewById(R.id.authors);
      mBookCoverView = (ImageView) view.findViewById(R.id.book_cover);
    }
  }
}
