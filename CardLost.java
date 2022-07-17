package com.company;

public class CardLost extends Lost{
    private String CardNumber;
    public CardLost(){
        this.CardNumber=CardNumber;
    }
    public CardLost(String name,String date,String place,String CardNumber){
        super(name,date,place);
        this.CardNumber=CardNumber;
    }
    public String getCardNumber(){
        return this.CardNumber;
    }
    public String setCardNumber(String CardNumber){
        return this.CardNumber;
    }

    @Override
    public String toString() {
        return "CardLost{" +super.getName()+"  "+ CardNumber + "  " +super.getDate()+"  "+super.getPlace()+
                '}';
    }
}

