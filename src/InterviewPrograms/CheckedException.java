package InterviewPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String args[]) throws FileNotFoundException {
        FileInputStream fileInputStream=null;
        fileInputStream=new FileInputStream("/Users/meghana.r/SCRAPE_DATA/New CV1");
    }
}
