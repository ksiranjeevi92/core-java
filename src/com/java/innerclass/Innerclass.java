package com.java.innerclass;

public class Innerclass {
    String message;

    public Innerclass(String message){
        this.message = message;
    }

    public String getMessage(){
         class BuildMessage {
            public String build() {
                return "Hello";
             }
        }

        BuildMessage bm = new BuildMessage();

         return bm.build();
    }

    public class Cat{
        String name;

        public Cat(String name){
            this.name = name;
        }
    }

    public static class  AnimalBreed{
        String type;
    }
}
