package com.example.jdong.retrofit;

import java.util.List;

/**
 * Created by jdong on 11/30/17.
 */
public class Book {
  /**
   * kind : books#volume
   * id : qKFDDAAAQBAJ
   * etag : 75l+gvai2fM
   * selfLink : https://www.googleapis.com/books/v1/volumes/qKFDDAAAQBAJ
   * volumeInfo : {"title":"Android","authors":["P.K. Dixit"],"publisher":"Vikas Publishing House","publishedDate":"2014","description":"Android is a movement that has transferred data from laptop to hand-held devices like mobiles. Though there are alternate technologies that compete with Android, but it is the front runner in mobile technology by a long distance. Good knowledge in basic Java will help you to understand and develop Android technology and apps. Many universities in India and across the world are now teaching Android in their syllabus, which shows the importance of this subject. This book can be read by anyone who knows Java and XML concepts. It includes a lot of diagrams along with explanations to facilitate better understanding by students. This book aptly concludes with a project that uses Android, which will greatly benefit students in learning the practical aspects of Android. Key Features \u2022 Instructions in designing different Android user interfaces \u2022 Thorough explanations of all activities \u2022 JSON \u2022 Android-based project to aid practical understanding","industryIdentifiers":[{"type":"ISBN_13","identifier":"9789325977884"},{"type":"ISBN_10","identifier":"9325977885"}],"readingModes":{"text":false,"image":true},"pageCount":372,"printType":"BOOK","categories":["Computers"],"maturityRating":"NOT_MATURE","allowAnonLogging":false,"contentVersion":"preview-1.0.0","panelizationSummary":{"containsEpubBubbles":false,"containsImageBubbles":false},"imageLinks":{"smallThumbnail":"http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api","thumbnail":"http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"},"language":"en","previewLink":"http://books.google.com/books?id=qKFDDAAAQBAJ&pg=PP1&dq=android&hl=&cd=1&source=gbs_api","infoLink":"https://play.google.com/store/books/details?id=qKFDDAAAQBAJ&source=gbs_api","canonicalVolumeLink":"https://market.android.com/details?id=book-qKFDDAAAQBAJ"}
   * saleInfo : {"country":"US","saleability":"FOR_SALE","isEbook":true,"listPrice":{"amount":15.99,"currencyCode":"USD"},"retailPrice":{"amount":9.99,"currencyCode":"USD"},"buyLink":"https://play.google.com/store/books/details?id=qKFDDAAAQBAJ&rdid=book-qKFDDAAAQBAJ&rdot=1&source=gbs_api","offers":[{"finskyOfferType":1,"listPrice":{"amountInMicros":1.599E7,"currencyCode":"USD"},"retailPrice":{"amountInMicros":9990000,"currencyCode":"USD"},"giftable":true}]}
   * accessInfo : {"country":"US","viewability":"PARTIAL","embeddable":true,"publicDomain":false,"textToSpeechPermission":"ALLOWED","epub":{"isAvailable":false},"pdf":{"isAvailable":true,"acsTokenLink":"http://books.google.com/books/download/Android-sample-pdf.acsm?id=qKFDDAAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"},"webReaderLink":"http://play.google.com/books/reader?id=qKFDDAAAQBAJ&hl=&printsec=frontcover&source=gbs_api","accessViewStatus":"SAMPLE","quoteSharingAllowed":false}
   * searchInfo : {"textSnippet":"Many universities in India and across the world are now teaching Android in their syllabus, which shows the importance of this subject. This book can be read by anyone who knows Java and XML concepts."}
   */

  private String kind;
  private String id;
  private String etag;
  private String selfLink;
  private VolumeInfoBean volumeInfo;
  private SaleInfoBean saleInfo;
  private AccessInfoBean accessInfo;
  private SearchInfoBean searchInfo;

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public VolumeInfoBean getVolumeInfo() {
    return volumeInfo;
  }

  public void setVolumeInfo(VolumeInfoBean volumeInfo) {
    this.volumeInfo = volumeInfo;
  }

  public SaleInfoBean getSaleInfo() {
    return saleInfo;
  }

  public void setSaleInfo(SaleInfoBean saleInfo) {
    this.saleInfo = saleInfo;
  }

  public AccessInfoBean getAccessInfo() {
    return accessInfo;
  }

  public void setAccessInfo(AccessInfoBean accessInfo) {
    this.accessInfo = accessInfo;
  }

  public SearchInfoBean getSearchInfo() {
    return searchInfo;
  }

  public void setSearchInfo(SearchInfoBean searchInfo) {
    this.searchInfo = searchInfo;
  }

  public static class VolumeInfoBean {
    /**
     * title : Android
     * authors : ["P.K. Dixit"]
     * publisher : Vikas Publishing House
     * publishedDate : 2014
     * description : Android is a movement that has transferred data from laptop to hand-held devices like mobiles. Though there are alternate technologies that compete with Android, but it is the front runner in mobile technology by a long distance. Good knowledge in basic Java will help you to understand and develop Android technology and apps. Many universities in India and across the world are now teaching Android in their syllabus, which shows the importance of this subject. This book can be read by anyone who knows Java and XML concepts. It includes a lot of diagrams along with explanations to facilitate better understanding by students. This book aptly concludes with a project that uses Android, which will greatly benefit students in learning the practical aspects of Android. Key Features • Instructions in designing different Android user interfaces • Thorough explanations of all activities • JSON • Android-based project to aid practical understanding
     * industryIdentifiers : [{"type":"ISBN_13","identifier":"9789325977884"},{"type":"ISBN_10","identifier":"9325977885"}]
     * readingModes : {"text":false,"image":true}
     * pageCount : 372
     * printType : BOOK
     * categories : ["Computers"]
     * maturityRating : NOT_MATURE
     * allowAnonLogging : false
     * contentVersion : preview-1.0.0
     * panelizationSummary : {"containsEpubBubbles":false,"containsImageBubbles":false}
     * imageLinks : {"smallThumbnail":"http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api","thumbnail":"http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"}
     * language : en
     * previewLink : http://books.google.com/books?id=qKFDDAAAQBAJ&pg=PP1&dq=android&hl=&cd=1&source=gbs_api
     * infoLink : https://play.google.com/store/books/details?id=qKFDDAAAQBAJ&source=gbs_api
     * canonicalVolumeLink : https://market.android.com/details?id=book-qKFDDAAAQBAJ
     */

    private String title;
    private String publisher;
    private String publishedDate;
    private String description;
    private VolumeInfoBean.ReadingModesBean readingModes;
    private int pageCount;
    private String printType;
    private String maturityRating;
    private boolean allowAnonLogging;
    private String contentVersion;
    private VolumeInfoBean.PanelizationSummaryBean panelizationSummary;
    private VolumeInfoBean.ImageLinksBean imageLinks;
    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;
    private List<String> authors;
    private List<VolumeInfoBean.IndustryIdentifiersBean> industryIdentifiers;
    private List<String> categories;

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getPublisher() {
      return publisher;
    }

    public void setPublisher(String publisher) {
      this.publisher = publisher;
    }

    public String getPublishedDate() {
      return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
      this.publishedDate = publishedDate;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public VolumeInfoBean.ReadingModesBean getReadingModes() {
      return readingModes;
    }

    public void setReadingModes(VolumeInfoBean.ReadingModesBean readingModes) {
      this.readingModes = readingModes;
    }

    public int getPageCount() {
      return pageCount;
    }

    public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
    }

    public String getPrintType() {
      return printType;
    }

    public void setPrintType(String printType) {
      this.printType = printType;
    }

    public String getMaturityRating() {
      return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
      this.maturityRating = maturityRating;
    }

    public boolean isAllowAnonLogging() {
      return allowAnonLogging;
    }

    public void setAllowAnonLogging(boolean allowAnonLogging) {
      this.allowAnonLogging = allowAnonLogging;
    }

    public String getContentVersion() {
      return contentVersion;
    }

    public void setContentVersion(String contentVersion) {
      this.contentVersion = contentVersion;
    }

    public VolumeInfoBean.PanelizationSummaryBean getPanelizationSummary() {
      return panelizationSummary;
    }

    public void setPanelizationSummary(VolumeInfoBean.PanelizationSummaryBean panelizationSummary) {
      this.panelizationSummary = panelizationSummary;
    }

    public VolumeInfoBean.ImageLinksBean getImageLinks() {
      return imageLinks;
    }

    public void setImageLinks(VolumeInfoBean.ImageLinksBean imageLinks) {
      this.imageLinks = imageLinks;
    }

    public String getLanguage() {
      return language;
    }

    public void setLanguage(String language) {
      this.language = language;
    }

    public String getPreviewLink() {
      return previewLink;
    }

    public void setPreviewLink(String previewLink) {
      this.previewLink = previewLink;
    }

    public String getInfoLink() {
      return infoLink;
    }

    public void setInfoLink(String infoLink) {
      this.infoLink = infoLink;
    }

    public String getCanonicalVolumeLink() {
      return canonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
      this.canonicalVolumeLink = canonicalVolumeLink;
    }

    public List<String> getAuthors() {
      return authors;
    }

    public void setAuthors(List<String> authors) {
      this.authors = authors;
    }

    public List<VolumeInfoBean.IndustryIdentifiersBean> getIndustryIdentifiers() {
      return industryIdentifiers;
    }

    public void setIndustryIdentifiers(List<VolumeInfoBean.IndustryIdentifiersBean> industryIdentifiers) {
      this.industryIdentifiers = industryIdentifiers;
    }

    public List<String> getCategories() {
      return categories;
    }

    public void setCategories(List<String> categories) {
      this.categories = categories;
    }

    public static class ReadingModesBean {
      /**
       * text : false
       * image : true
       */

      private boolean text;
      private boolean image;

      public boolean isText() {
        return text;
      }

      public void setText(boolean text) {
        this.text = text;
      }

      public boolean isImage() {
        return image;
      }

      public void setImage(boolean image) {
        this.image = image;
      }
    }

    public static class PanelizationSummaryBean {
      /**
       * containsEpubBubbles : false
       * containsImageBubbles : false
       */

      private boolean containsEpubBubbles;
      private boolean containsImageBubbles;

      public boolean isContainsEpubBubbles() {
        return containsEpubBubbles;
      }

      public void setContainsEpubBubbles(boolean containsEpubBubbles) {
        this.containsEpubBubbles = containsEpubBubbles;
      }

      public boolean isContainsImageBubbles() {
        return containsImageBubbles;
      }

      public void setContainsImageBubbles(boolean containsImageBubbles) {
        this.containsImageBubbles = containsImageBubbles;
      }
    }

    public static class ImageLinksBean {
      /**
       * smallThumbnail : http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api
       * thumbnail : http://books.google.com/books/content?id=qKFDDAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api
       */

      private String smallThumbnail;
      private String thumbnail;

      public String getSmallThumbnail() {
        return smallThumbnail;
      }

      public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
      }

      public String getThumbnail() {
        return thumbnail;
      }

      public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
      }
    }

    public static class IndustryIdentifiersBean {
      /**
       * type : ISBN_13
       * identifier : 9789325977884
       */

      private String type;
      private String identifier;

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public String getIdentifier() {
        return identifier;
      }

      public void setIdentifier(String identifier) {
        this.identifier = identifier;
      }
    }
  }

  public static class SaleInfoBean {
    /**
     * country : US
     * saleability : FOR_SALE
     * isEbook : true
     * listPrice : {"amount":15.99,"currencyCode":"USD"}
     * retailPrice : {"amount":9.99,"currencyCode":"USD"}
     * buyLink : https://play.google.com/store/books/details?id=qKFDDAAAQBAJ&rdid=book-qKFDDAAAQBAJ&rdot=1&source=gbs_api
     * offers : [{"finskyOfferType":1,"listPrice":{"amountInMicros":1.599E7,"currencyCode":"USD"},"retailPrice":{"amountInMicros":9990000,"currencyCode":"USD"},"giftable":true}]
     */

    private String country;
    private String saleability;
    private boolean isEbook;
    private SaleInfoBean.ListPriceBean listPrice;
    private SaleInfoBean.RetailPriceBean retailPrice;
    private String buyLink;
    private List<SaleInfoBean.OffersBean> offers;

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public String getSaleability() {
      return saleability;
    }

    public void setSaleability(String saleability) {
      this.saleability = saleability;
    }

    public boolean isIsEbook() {
      return isEbook;
    }

    public void setIsEbook(boolean isEbook) {
      this.isEbook = isEbook;
    }

    public SaleInfoBean.ListPriceBean getListPrice() {
      return listPrice;
    }

    public void setListPrice(SaleInfoBean.ListPriceBean listPrice) {
      this.listPrice = listPrice;
    }

    public SaleInfoBean.RetailPriceBean getRetailPrice() {
      return retailPrice;
    }

    public void setRetailPrice(SaleInfoBean.RetailPriceBean retailPrice) {
      this.retailPrice = retailPrice;
    }

    public String getBuyLink() {
      return buyLink;
    }

    public void setBuyLink(String buyLink) {
      this.buyLink = buyLink;
    }

    public List<SaleInfoBean.OffersBean> getOffers() {
      return offers;
    }

    public void setOffers(List<SaleInfoBean.OffersBean> offers) {
      this.offers = offers;
    }

    public static class ListPriceBean {
      /**
       * amount : 15.99
       * currencyCode : USD
       */

      private double amount;
      private String currencyCode;

      public double getAmount() {
        return amount;
      }

      public void setAmount(double amount) {
        this.amount = amount;
      }

      public String getCurrencyCode() {
        return currencyCode;
      }

      public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
      }
    }

    public static class RetailPriceBean {
      /**
       * amount : 9.99
       * currencyCode : USD
       */

      private double amount;
      private String currencyCode;

      public double getAmount() {
        return amount;
      }

      public void setAmount(double amount) {
        this.amount = amount;
      }

      public String getCurrencyCode() {
        return currencyCode;
      }

      public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
      }
    }

    public static class OffersBean {
      /**
       * finskyOfferType : 1
       * listPrice : {"amountInMicros":1.599E7,"currencyCode":"USD"}
       * retailPrice : {"amountInMicros":9990000,"currencyCode":"USD"}
       * giftable : true
       */

      private int finskyOfferType;
      private SaleInfoBean.OffersBean.ListPriceBeanX listPrice;
      private SaleInfoBean.OffersBean.RetailPriceBeanX retailPrice;
      private boolean giftable;

      public int getFinskyOfferType() {
        return finskyOfferType;
      }

      public void setFinskyOfferType(int finskyOfferType) {
        this.finskyOfferType = finskyOfferType;
      }

      public SaleInfoBean.OffersBean.ListPriceBeanX getListPrice() {
        return listPrice;
      }

      public void setListPrice(SaleInfoBean.OffersBean.ListPriceBeanX listPrice) {
        this.listPrice = listPrice;
      }

      public SaleInfoBean.OffersBean.RetailPriceBeanX getRetailPrice() {
        return retailPrice;
      }

      public void setRetailPrice(SaleInfoBean.OffersBean.RetailPriceBeanX retailPrice) {
        this.retailPrice = retailPrice;
      }

      public boolean isGiftable() {
        return giftable;
      }

      public void setGiftable(boolean giftable) {
        this.giftable = giftable;
      }

      public static class ListPriceBeanX {
        /**
         * amountInMicros : 1.599E7
         * currencyCode : USD
         */

        private double amountInMicros;
        private String currencyCode;

        public double getAmountInMicros() {
          return amountInMicros;
        }

        public void setAmountInMicros(double amountInMicros) {
          this.amountInMicros = amountInMicros;
        }

        public String getCurrencyCode() {
          return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
          this.currencyCode = currencyCode;
        }
      }

      public static class RetailPriceBeanX {
        /**
         * amountInMicros : 9990000
         * currencyCode : USD
         */

        private int amountInMicros;
        private String currencyCode;

        public int getAmountInMicros() {
          return amountInMicros;
        }

        public void setAmountInMicros(int amountInMicros) {
          this.amountInMicros = amountInMicros;
        }

        public String getCurrencyCode() {
          return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
          this.currencyCode = currencyCode;
        }
      }
    }
  }

  public static class AccessInfoBean {
    /**
     * country : US
     * viewability : PARTIAL
     * embeddable : true
     * publicDomain : false
     * textToSpeechPermission : ALLOWED
     * epub : {"isAvailable":false}
     * pdf : {"isAvailable":true,"acsTokenLink":"http://books.google.com/books/download/Android-sample-pdf.acsm?id=qKFDDAAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"}
     * webReaderLink : http://play.google.com/books/reader?id=qKFDDAAAQBAJ&hl=&printsec=frontcover&source=gbs_api
     * accessViewStatus : SAMPLE
     * quoteSharingAllowed : false
     */

    private String country;
    private String viewability;
    private boolean embeddable;
    private boolean publicDomain;
    private String textToSpeechPermission;
    private AccessInfoBean.EpubBean epub;
    private AccessInfoBean.PdfBean pdf;
    private String webReaderLink;
    private String accessViewStatus;
    private boolean quoteSharingAllowed;

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public String getViewability() {
      return viewability;
    }

    public void setViewability(String viewability) {
      this.viewability = viewability;
    }

    public boolean isEmbeddable() {
      return embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
      this.embeddable = embeddable;
    }

    public boolean isPublicDomain() {
      return publicDomain;
    }

    public void setPublicDomain(boolean publicDomain) {
      this.publicDomain = publicDomain;
    }

    public String getTextToSpeechPermission() {
      return textToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
      this.textToSpeechPermission = textToSpeechPermission;
    }

    public AccessInfoBean.EpubBean getEpub() {
      return epub;
    }

    public void setEpub(AccessInfoBean.EpubBean epub) {
      this.epub = epub;
    }

    public AccessInfoBean.PdfBean getPdf() {
      return pdf;
    }

    public void setPdf(AccessInfoBean.PdfBean pdf) {
      this.pdf = pdf;
    }

    public String getWebReaderLink() {
      return webReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
      this.webReaderLink = webReaderLink;
    }

    public String getAccessViewStatus() {
      return accessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
      this.accessViewStatus = accessViewStatus;
    }

    public boolean isQuoteSharingAllowed() {
      return quoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(boolean quoteSharingAllowed) {
      this.quoteSharingAllowed = quoteSharingAllowed;
    }

    public static class EpubBean {
      /**
       * isAvailable : false
       */

      private boolean isAvailable;

      public boolean isIsAvailable() {
        return isAvailable;
      }

      public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
      }
    }

    public static class PdfBean {
      /**
       * isAvailable : true
       * acsTokenLink : http://books.google.com/books/download/Android-sample-pdf.acsm?id=qKFDDAAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api
       */

      private boolean isAvailable;
      private String acsTokenLink;

      public boolean isIsAvailable() {
        return isAvailable;
      }

      public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
      }

      public String getAcsTokenLink() {
        return acsTokenLink;
      }

      public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
      }
    }
  }

  public static class SearchInfoBean {
    /**
     * textSnippet : Many universities in India and across the world are now teaching Android in their syllabus, which shows the importance of this subject. This book can be read by anyone who knows Java and XML concepts.
     */

    private String textSnippet;

    public String getTextSnippet() {
      return textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
      this.textSnippet = textSnippet;
    }
  }
}
