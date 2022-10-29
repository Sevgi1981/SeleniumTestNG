package code.StudyHall;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class day_08_ListenersTestNG implements ITestListener {


    public void onTestStart(ITestResult result){
        ITestListener.super.onTestSuccess(result);
        System.out.println("Test Started: " + result.getName());
    }
    public void onTestSuccess(ITestResult result){
        ITestListener.super.onTestSuccess(result);
        System.out.println("Test is successful: " + result.getName());
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Test is failed: " + result.getName());

    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Test is skipped : " + result.getName());
    }

}
