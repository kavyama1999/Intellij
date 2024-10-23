package com.xworkz.winter.dto;

public class SearchDTO {




//    private String name;

    private String event;



    public SearchDTO()
    {
        System.out.println("No parameters in SearchDTO....");
    }




    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }


    @Override
    public String toString() {
        return "SearchDTO{" +
                "event='" + event + '\'' +
                '}';
    }
}
