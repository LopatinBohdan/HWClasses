import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Human first = new Human();
        first.SetName("name1");
        first.SetAddress("someAddress");
        first.SetCity("SomeCity");
        first.SetCountry("SomeCountry");
        first.SetPhone("11111111111111");
        first.SetDate(2014,6,29);

//        System.out.println(first.GetName());
//        System.out.println(first.GetDate());
//        System.out.println(first.GetPhone());
//        System.out.println(first.GetCity());
//        System.out.println(first.GetCountry());
//        System.out.println(first.GetAddress());

        City city=new City();
        city.SetName("cityName");
        city.SetRegion("cityRegion");
        city.SetCountry("cityCountry");
        city.SetPopulation(4.4);
        city.SetIndex(4);
        city.SetPhoneCode(44);

//        System.out.println(city.GetName());
//        System.out.println(city.GetRegion());
//        System.out.println(city.GetCountry());
//        System.out.println(city.GetPopulation());
//        System.out.println(city.GetIndex());
//        System.out.println(city.GetPhoneCode());

        Country country=new Country();
        country.SetName("countryName");
        country.SetContinent("countryContinent");
        country.SetPopulation(4.4);
        country.SetCode("code4");
        country.SetCapital("someCapital");
        country.AddCities("city1");
        country.AddCities("city2");

//        System.out.println(country.GetName());
//        System.out.println(country.GetContinent());
//        System.out.println(country.GetPopulation());
//        System.out.println(country.GetCode());
//        System.out.println(country.GetCapital());
//        country.GetCities();

        Fraction f1=new Fraction(1,2);
        Fraction f2=new Fraction(2,3);

//        f1.getFraction();
//        f2.getFraction();
//        Fraction f3=f1.AddFraction(f2);
//        f3.getFraction();
//        f3=f1.SubstractionFraction(f2);
//        f3.getFraction();
//        f3=f1.MultiplyFraction(f2);
//        f3.getFraction();
//        f3=f1.DivideFraction(f2);
//        f3.getFraction();
        Book book=new Book();

        book.setTitle("title");
        book.setAuthor("author");
        book.setPublisherYear(2000);
        book.setPublisher("publisher");
        book.setGenre("genre");
        book.setPages(144);

       // book.showBook();

        Car car=new Car();
        car.getCar();


    }
}


    class Car{

        private String title;
        private String manufacturer;
        private int year;
        private double engineVolume;

        Car(){
            this.title="Mercedes";
            this.manufacturer="Mercedes_Benz";
            this.year=1897;
            this.engineVolume=2.4;
        }
        Car(String title,String manufacturer, int year, double engine){
            this.title=title;
            this.manufacturer=manufacturer;
            this.year=year;
            this.engineVolume=engine;
        }

        void setTitle(String title){
            this.title=title;
        }
        String getTitle(){
            return this.title;
        }
        void setManufacturer(String manufacturer){
            this.manufacturer=manufacturer;
        }
        String getManufacturer(){
            return this.manufacturer;
        }
        void setYear(int year){
            this.year=year;
        }
        int getYear(){
            return this.year;
        }
        void setEngineVolume(double engine){
            this.engineVolume=engine;
        }
        double getEngineVolume(){
            return this.engineVolume;
        }

        void getCar(){
            System.out.println("Title: "+this.title);
            System.out.println("Manufacturer: "+this.manufacturer);
            System.out.println("Year: "+this.year);
            System.out.println("Engine: "+this.engineVolume);
        }
    }

    class Book{
        private String title;
        private String author;
        private int publishYear;
        private String publisher;
        private String genre;
        private int pages;

        Book(){
            this.title="title";
            this.author="author";
            this.publishYear=2014;
            this.publisher="publisher";
            this.genre="genre";
            this.pages=100;
        }
        Book(String title, String author, int publishYear,String publisher, String genre, int pages){
            this.title=title;
            this.author=author;
            this.publishYear=publishYear;
            this.publisher=publisher;
            this.genre=genre;
            this.pages=pages;
        }

        public void setTitle(String title){
            this.title=title;
        }
        public String getTitle(){
            return this.title;
        }
        public void setAuthor(String author){
            this.author=author;
        }
        public String getAuthor(){
            return this.author;
        }
        public void setPublisherYear(int year){
            this.publishYear=year;
        }
        public int getPublisherYear(){
            return this.publishYear;
        }
        public void setPublisher(String publisher){
            this.publisher=publisher;
        }
        public String getPublisher(){
            return this.publisher;
        }
        public void setGenre(String genre){
            this.genre=genre;
        }
        public String getGenre(){
            return this.genre;
        }
        public void setPages(int pages){
            this.pages=pages;
        }
        public int getPages(){
            return this.pages;
        }

        public void showBook(){
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("Year: " + this.publishYear);
            System.out.println("Publisher: " + this.publisher);
            System.out.println("Genre: " + this.genre);
            System.out.println("Pages: " + this.pages);


        }


    }
    class Fraction{
        private int numerator;
        private int denominator;
        private Scanner scanner;

        Fraction(){
            scanner = new Scanner(System.in);
            this.numerator=1;
            this.denominator=1;
        }
        Fraction(int numerator, int denominator){
            this.numerator=numerator;
            this.denominator=denominator;
        }

        public void setNumerator(int numerator){
            this.numerator=numerator;
        }

        public int getNumerator() {
            return numerator;
        }
        public void setDenominator(int denominator){
            this.denominator=denominator;
        }
        public void getFraction(){
            System.out.println(numerator+"/"+denominator);
        }

        public Fraction AddFraction(Fraction fraction){
            Fraction result=new Fraction();
            result.setDenominator(this.denominator*fraction.denominator);
            result.setNumerator(this.numerator*fraction.denominator+fraction.numerator*this.denominator);
            return result;
        }
        public Fraction SubstractionFraction(Fraction fraction){
            Fraction result=new Fraction();
            result.setDenominator(this.denominator*fraction.denominator);
            result.setNumerator(this.numerator*fraction.denominator-fraction.numerator*this.denominator);
            return result;
        }
        public Fraction MultiplyFraction(Fraction fraction){
            Fraction result=new Fraction();
            result.setDenominator(this.denominator*fraction.denominator);
            result.setNumerator(this.numerator*fraction.numerator);
            return result;
        }
        public Fraction DivideFraction(Fraction fraction){
            Fraction result=new Fraction();
            result.setDenominator(this.denominator*fraction.numerator);
            result.setNumerator(this.numerator*fraction.denominator);
            return result;
        }


    }
    class Country{
        private String name;
        private String continent;
        private double population;
        private String code;
        private String capital;
        private ArrayList<String> cities;

        public void AddCities(String city){
            this.cities.add(city);
        }
        public void GetCities(){
            System.out.println(this.cities.toString());
        }

        Country(){
            this.cities=new ArrayList<String>();
        }
        public void SetName(String name){
            this.name=name;
        }
        public String GetName(){
            return this.name;
        }

        public void SetContinent(String continent){
            this.continent=continent;
        }
        public String GetContinent(){
            return this.continent;
        }
        public void SetPopulation(double continent){
            this.population=population;
        }
        public double GetPopulation(){
            return this.population;
        }
        public void SetCode(String code){
            this.code=code;
        }
        public String GetCode(){
            return this.code;
        }
        public void SetCapital(String capital){
            this.capital=capital;
        }
        public String GetCapital(){
            return this.capital;
        }
    }
    class City{
        private String name;
        private String region;
        private String country;
        private double population;
        private int index;
        private int phoneCode;

        public void SetName(String name){
            this.name=name;
        }
        public String GetName(){
            return this.name;
        }
        public void SetRegion(String region){
            this.region=region;
        }
        public String GetRegion(){
            return this.region;
        }
        public void SetCountry(String country){
            this.country=country;
        }
        public String GetCountry(){
            return this.country;
        }
        public void SetPopulation(double population){
            this.population=population;
        }
        public double GetPopulation(){
            return this.population;
        }
        public void SetIndex(int index){
            this.index=index;
        }
        public  int GetIndex(){
            return this.index;
        }
        public void SetPhoneCode(int phoneCode){
            this.phoneCode=phoneCode;
        }
        public int GetPhoneCode(){
            return  this.phoneCode;
        }

    }
    class Human{
        private String name;
        private LocalDate date;
        private String phone;
        private String city;
        private String country;
        private String address;

        Human(){
            name="name";
            date=LocalDate.now();
            phone="000000000";
            city="city";
            country="country";
            address="address";
        }

        public void SetName(String name){
            this.name=name;
        }
        public void SetDate(int year, int month, int day){
            date=LocalDate.of(year,month,day);
        }
        public void SetPhone(String phone){
            this.phone=phone;
        }
        public void SetCity(String city){
            this.city=city;
        }
        public void SetCountry(String country){
            this.country=country;
        }
        public void SetAddress(String address){
            this.address=address;
        }

        public String GetName(){
            return this.name;
        }
        public String GetDate(){
            return this.date.toString();
        }
        public String GetPhone(){
            return this.phone;
        }
        public String GetCity(){
            return this.city;
        }
        public String GetCountry(){
            return this.country;
        }
        public String GetAddress(){
            return this.address;
        }
    }


