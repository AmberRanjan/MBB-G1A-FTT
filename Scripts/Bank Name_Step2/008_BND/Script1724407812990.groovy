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

'Verify the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/38_VerifyText - 0 Important'), '0 Important')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981862865868730001.png')
Mobile.takeScreenshot()

'Tap on cross icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/40_TapOnCrossIcon'), 0)

'User navigated to step 2 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/41_VerifyText - Step 2 of 4'), 'Step 2 of 4')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981862865868730001.png')
Mobile.takeScreenshot()

'Tap on Back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/42_TapOnBackicon'), 0)

'Verify user is on Step 1 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/01_VerifyText - Step 1 of 4'), 'Step 1 of 4')

'Take screenshot once user navigates to Step 1 of 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3427090599859691217.png')
Mobile.takeScreenshot()

'Tap on Continue button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/26_UserTapOnContinue'), 0)

'Verify user navigated to Details confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/27_VerifyText - Before you continue, please ensure you have the following information'),
	'Before you continue, please ensure you have the following information:')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6357508002367164689.png')
Mobile.takeScreenshot()

'Tap on Continue button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/37_TapOnContinue'), 0)

'Pop-up appears on the screen before navigating to screen 2'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/38_VerifyText - 0 Important'), '0 Important')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981862865868730001.png')
Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/39_TapOnContinue'), 0)

'User navigated to Step 2 of Step 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/41_VerifyText - Step 2 of 4'), 'Step 2 of 4')

'Tale screenshot once user navigated to step 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981862865868730001.png')
Mobile.takeScreenshot()

'Verify Text stating FTT'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/43_VerifyText - Foreign Telegraphic Transfer'),
	'Foreign Telegraphic Transfer')

'Verify Text requesting to fill in Bank details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/44_VerifyText - Please fill in recipients bank details'),
	'Please fill in recipient\'s bank details')

'Verify Bank Name Text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/45_VerifyText - Bank name'), 'Bank name')

'Set Bank Name'
Mobile.setText(findTestObject('Object Repository/BankName/008_SetBankName - e.g. Maybank'), 'Maybank', 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2147251951258157016.png')
Mobile.takeScreenshot()

'Verify Account Number header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/50_VerifyText - Account number'), 'Account number')

'Set the account number'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/51_SetAccNum - e.g. 8888 1212 8888'), '888812128888', 0)

'Take screenshot after entering Account number'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6644695314416814549.png')
Mobile.takeScreenshot()

'Verify text stating Branch Address'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/52_VerifyText - Branch address'), 'Branch address')

'Set Branch Address'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/57_SetText_BranchAddress -  e.g. 1, Jalan MAEga, Sea Park'),
	'Branch Address', 0)

'Take screenshot once the branch address is set'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3688022250972900369.png')
Mobile.takeScreenshot()

'Verify the City header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/58_VerifyText - City'), 'City')

'Set Kuala Lumpur as city'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/59_SetText- e.g. WP Kuala Lumpur'), 'Kuala Lumpur', 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6703452165125571673.png')
Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/60_TapOnContinue'), 0)