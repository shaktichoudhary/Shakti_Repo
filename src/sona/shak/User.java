package sona.shak;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class User {
	
@Persistent
private String uname;

@Persistent
private String pass;

@PrimaryKey
@Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
private Key key;

public Key getKey() {
	return key;
}

public void setKey(Key key) {
	this.key = key;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}
}
