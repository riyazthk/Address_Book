package com.User;

public class UserObjects {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phnum;
    UserObjects(String firstname, String lastname, String address, String city, String state, String zip, String phnum)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phnum=phnum;
    }

    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public String getZip()
    {
        return zip;
    }
    public void setZip(String zip)
    {
        this.zip = zip;
    }
    public String getPhnum()
    {
        return phnum;
    }
    public void setPhnum(String phnum)
    {
        this.phnum = phnum;
    }

    public String toString()
    {
        return "UserObjects [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
                + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phnum=" + phnum + "]";
    }
}
