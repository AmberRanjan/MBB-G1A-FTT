import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is on Slider 1'
Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/001_VerifyText_S1 - Your enhanced experienceis here'), 
    'Your enhanced experience\nis here')

'Take screenshot once user is on slider 1'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7427886972742679173.png')

Mobile.takeScreenshot()

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Onboarding/002_TapNext_S1'), 0)

'Verify user is on Slider 2'
Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/003_VerifyText_S2 - Your Maybank accounts at a glance'), 
    'Your Maybank accounts at a glance')

'Take screenshot once user is on slider 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot9068243254499333223.png')

Mobile.takeScreenshot()

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Onboarding/004_TapNext_S2'), 0)

'Verify user is on Slider 3'
Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/005_VerifyText_S3 - Pay  transfer on the go'), 'Pay & transfer on the go')

'Take screenshot once user is on slider 3'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5446256657296482371.png')

Mobile.takeScreenshot()

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Onboarding/006_TapNext_S3'), 0)

'Verify user is on Slider 5'
Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/007_VerifyText_S4 - Customise your Quick Actions'), 
    'Customise your Quick Actions')

'Take screenshot once user is on slider 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7120380021568970444.png')

Mobile.takeScreenshot()

'Tap on Got It Button'
Mobile.tap(findTestObject('Object Repository/Onboarding/008_TapGotIt_S4'), 0)

'Verify Terms and condition pop up'
Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/009_VerifyText - Terms  Conditions'), 'Terms & Conditions')

'Take screenshot of Terms and Condition pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7554472531001814262.png')

Mobile.takeScreenshot()

'Tap on Agree Button'
Mobile.tap(findTestObject('Object Repository/Onboarding/010_TapOnAgree'), 0)

