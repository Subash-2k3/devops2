package com.mycompany.jpro1;
class Account {
    private long acc_no;
    private String name;
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}public class  Encap  {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(7560504000L);
        acc.setName("yashashivi Jaiswal");
        System.out.println(acc.getAcc_no()+" "+acc.getName());
    }
}

