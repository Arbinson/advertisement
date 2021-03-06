package com.it.advertisement.entity;

import java.io.Serializable;

public class User implements Serializable {  
	  
    
      
    /**
	 * 
	 */
	private static final long serialVersionUID = 4599567184669161121L;

	private Long id;  
      
    private String userName;  
      
    private Integer age;  
  
    public Long getId() {  
        return id;  
    }  
  
    public void setId(Long id) {  
        this.id = id;  
    }  
  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
  
    public Integer getAge() {  
        return age;  
    }  
  
    public void setAge(Integer age) {  
        this.age = age;  
    }  
  
    @Override  
    public String toString() {  
        return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";  
    }  
      
      
}  