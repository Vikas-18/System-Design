package org.example.SingletonDesignPattern;

public class Logger {
    private  Logger logger = null;
    private Logger(){}

    public static Logger getInstance()
    {
        if(this.logger==null)
        {
            System.out.println("i get called for first time");
            return this.logger = new Logger();
        }
        System.out.println("same instance i am returning");
        return this.logger;
    }

}
