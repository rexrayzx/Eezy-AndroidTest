package ai.eezy.generics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;


/**
 * 
 * @author Rajiv
 *
 */
public class JavaUtil {
	/**
	 * To get current date
	 * @return String
	 */
	public String currentdate() {
		Date date=new Date();
		String strDate = date.toString();
		return strDate;
	}
	/**
	 * To get random number
	 * @return int
	 */
	public int randomvalue() {
		Random ran=new Random();
		int num=ran.nextInt(5000);
		return num;
	}
	/**
	 * To create random First Name
	 * @return String
	 */
	public String randomName() {
		Faker fake=new Faker();
		return fake.name().firstName();
	}
	/**
	 * To create random FullName
	 * @return
	 */
	public String randomFullName() {
		Faker fake=new Faker();
		return fake.name().fullName();
	}
}