package com.boot.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "model_param")
public class ModelParam 
{
	@Id
	@GeneratedValue
	private int aid;
	private String aname;
	private String pass;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "ModelParam [aid=" + aid + ", aname=" + aname + ", pass=" + pass + "]";
	}

}
