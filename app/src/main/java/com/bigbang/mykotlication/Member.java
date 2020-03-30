package com.bigbang.mykotlication;

public class Member {

    private String name;
    private String memberID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }
}


