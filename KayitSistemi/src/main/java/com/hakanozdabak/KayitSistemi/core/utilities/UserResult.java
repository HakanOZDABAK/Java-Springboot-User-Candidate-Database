package com.hakanozdabak.KayitSistemi.core.utilities;

public class UserResult<T> extends Result{
    
	private T data;
	 
	public UserResult(T data,boolean success) {
		super(success);
		this.data = data;
		
	}
  
	public UserResult(T data,boolean success,String message) {
		
		super(success,message);
		this.data = data;
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
