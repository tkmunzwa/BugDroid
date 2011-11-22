package fr.julienvermet.bugdroid.database;

import java.io.Serializable;

public class Change implements Serializable{

	protected String added;
	protected String fieldName;
	protected String removed;
	
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getRemoved() {
		return removed;
	}
	public void setRemoved(String removed) {
		this.removed = removed;
	}
}