package com.example.demo.Java.DesignPatterns;

public class BuilderDesignPattern {

    private String name;
    private String email;

    public BuilderDesignPattern(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public BuilderDesignPattern(InnerClass innerClass) {
        this.name = innerClass.name;
        this.email = innerClass.email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    class InnerClass{

        private String name;
        private String email;

        public InnerClass setName(String name) {
            this.name = name;
            return this;
        }

        public InnerClass setEmail(String email) {
            this.email = email;
            return this;
        }

        public BuilderDesignPattern build(){
            return new BuilderDesignPattern(this);
        }
    }
}
