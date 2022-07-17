package com.company;

public class BookLost extends Lost{
    private String BookName;
    public BookLost(){
        this.BookName=BookName;
    }
    public BookLost(String name,String date,String place,String bookNamed) {
        super(name,date,place);
        this.BookName = BookName;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    @Override
    public String toString() {
        return "BookLost{" +super.getName()+"  "+ BookName + "  " +super.getDate()+"  "+super.getPlace()+
                '}';
    }
}

