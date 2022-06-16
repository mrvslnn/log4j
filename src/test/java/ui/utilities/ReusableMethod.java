package ui.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ui.pages.TC01Pages;

import java.util.Random;

public class ReusableMethod {
    public static void wait(int beklemeSuresi){

        try {
            Thread.sleep(beklemeSuresi);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int randomNumberGenerator(int max){//max sizımız getOptions yani seçenekteki baştan sona hepsi 0 hariç
        Random random = new Random();
        int randomNumber = random.nextInt(max -1 ) + 1;//0 ıncı indexteki day i almayacak
        return randomNumber;
    }
    public static void selections(WebElement dropDownUse) {
        TC01Pages pages = new TC01Pages();        //10 a kadar randomlı bir şeçenek oluşturalım
        //0'ıncı indexteki day i almadan 10 tane arasından seçsin
        Select dropDownSelect = new Select(dropDownUse);
        dropDownSelect.selectByIndex(randomNumberGenerator(dropDownSelect.getOptions().size()));
    }
}
