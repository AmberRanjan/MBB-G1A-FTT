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

'Tap on Overseas'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/12_TapOn - Overseas'), 0)

'Verify once user navigated inside overseas to transfer'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/13_VerifyText - Transfer To'), 'Transfer To')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6145525033473594086.png')

Mobile.takeScreenshot()

'Tap on Search'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/14_TapOnSearch'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot526816405931251389.png')

Mobile.takeScreenshot()

'Set text as India'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-212/15_Set_Singapore'), 'India', 0)

'Take screenshot after smart search'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot309964273721808221.png')

Mobile.takeScreenshot()

'Hide Keyboard'
Mobile.hideKeyboard()

'Tap on India'
Mobile.tap(findTestObject('Object Repository/Countries/01_TapOn - India'), 0)
Mobile.tap(findTestObject('Object Repository/Countries/01_TapOn - India'), 0)

'Verify user navigated to debiting account list screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/17_VerifyText - Select debiting account'), 'Select debiting account')

'Take screenshot after selecting debiting account'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3157720038614659842.png')
Mobile.takeScreenshot()

'Verify Text for GAA (USA)'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/18_VerifyUSDText - Global Access Account-i (USD)'),
	'Global Access Account-i (USD)')

'Tap on GAA (USD)'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/23_TapOnUSD - Global Access Account-i (USD)'), 0)

'Take screenshot after selecting GAA USD '
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot680161985477977004.png')
Mobile.takeScreenshot()

'Tap on continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/19_TapOnContinue'), 0)

'User navigated to Transfer Overseas screen to enter amount'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/20_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshot for the Transfer overseas screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7719960980461306686.png')
Mobile.takeScreenshot()

'Tap on Amount Field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/01_TapOnAmountField - 0.00'), 0)

'Take screenshot when the keyboard appears'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Ckeck without entering any amount'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/02_TapOnCheck'), 0)

'Take screenshot without entreing any amount'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Amount field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/01_TapOnAmountField - 0.00'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on 5'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/03_TapOn - 5'), 0)

'User enters 0 five times'
for (int i = 0; i < 3; i++) {
	//Tap on Number 3 times
	Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/04_TapOn - 0'), 0)
}

'Take screenshot after entring RM 5.00'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Check'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/02_TapOnCheck'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/05_TapOnContinue'), 0)

'Verify once user gets redirected to FTT calculation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/06_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshot once user gets redirected to FTT calculation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

Mobile.delay(3)


'VerifyText FTT'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/08_VerifyText - Foreign Telegraphic Transfer'),
	'Foreign Telegraphic Transfer')

'Verify Indicative Exchange Rate'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/09_VerifyText- Indicative exchange rate'), 'Indicative exchange rate')

'Verify daily transfer limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/10_VerifyText - Daily transfer limit'), 'Daily transfer limit')

'Verify Service Fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/11_VerifyText- Service fee'), 'Service fee')

'Verify Service fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/18_VerfifyText - RM 10.00'), 'RM 10.00')

'Verify Agent/Beneficiary Bank fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/12_VerifyText - AgentBeneficiaryBank fee'), 'Agent/Beneficiary\nBank fee')

'Verify text for Agent/Beneficiary fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/15_VerifyText - Applicable'), 'Applicable')

'Verify receive method'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/13_VerifyText - Receive method'), 'Receive method')

'Verify Receive method value'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/16_VerfifyText - Credit to account'), 'Credit to account')

'Verify teansfer duration text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/14_VerifyText - Transfer duration'), 'Transfer duration')

'Verify teansfer duration value'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/17_VerfifyText - 1 - 3 working days'), '1 - 3 working days')

'Select the Radio button for FTT'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/31_SelectRadioButton'), 0)

'Take screenshot once the radio button is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2765209938366148524.png')

Mobile.takeScreenshot()

'Tap on Transfer button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/32_TapOnTransferButton'), 0)

'Verify user is on Step 1 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/01_VerifyText - Step 1 of 4'), 'Step 1 of 4')

'Take screenshot once user navigates to Step 1 of 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3427090599859691217.png')
Mobile.takeScreenshot()

'Verify text stating Foreign Telegraphic Transfer'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/02_VerifyText - Foreign Telegraphic Transfer'),
	'Foreign Telegraphic Transfer')

'Verify text requesting to fill the details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/03_VerifyText - Please fill in your details'),
	'Please fill in your details')

'Verify Text for the Nationality'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/04_VerifyText - Nationality'), 'Nationality')

'Tap on Malysian radio button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/05_TapOnRadioButton - Malaysian'), 0)

Mobile.takeScreenshot()














