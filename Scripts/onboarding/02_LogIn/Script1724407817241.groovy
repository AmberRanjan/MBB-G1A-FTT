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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/011_VerifyText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6684125251599740727.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/012_TapOn - Log In Now'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/013_VerifyText - Lets Get Started'), 'Let\'s Get Started!')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/014_VerifyText - Log in to enjoy the app to its fullest'), 
    'Log in to enjoy the app to its fullest.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5425745148173696973.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/015_TapOn- Existing M2UMAE user Log in here'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/016_VerifyText - Please enter your username'), 'Please enter your username')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot234975518213639868.png')

Mobile.setText(findTestObject('Object Repository/Onboarding/017_SetText_username'), 'treasure5', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5450683590470120793.png')

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2015622443312210641.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/018_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/019_VerifyText - Is this your security phrase'), 'Is this your security phrase?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3669056771692345244.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/020_TapOn_Yes_itsMine'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/021_VerifyText - Enter your password'), 'Enter your password')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2699094310327221780.png')

Mobile.setText(findTestObject('Object Repository/Onboarding/022_SetPassword'), 'Maybank@1', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6004716684572271621.png')

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6547314893470865371.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/023_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/024_VerifyText - 6-digit PIN'), '6-digit PIN')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/025_VerifyText- Create your PIN for the app'), 'Create your PIN for the app')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7492365405871808335.png')

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your PIN no. is ', '')

def otpArr = otpText.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr.length; i++) {
	if ((otpArr[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6742546852739749705.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/027_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/028_VerifyText- Confirm your 6-digit PIN'), 'Confirm your 6-digit PIN')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1754417809434809291.png')

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Storing the pin inside a variable
def otpText2 = Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Applying the read pin from keyboard
otpText2 = otpText2.replace('Your PIN no. is ', '')

def otpArr2 = otpText2.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr2.length; i++) {
	if ((otpArr2[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr2[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr2[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr2[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr2[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr2[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr2[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr2[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr2[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr2[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6742546852739749705.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/027_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/029_VerifyText - Enable biometric ID for instant access'),
	'Enable biometric ID for instant access')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4690202598826181091.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/030_TapOn - Set Up Later'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/031_VerifyText - Verify Number'), 'Verify Number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5552548571466600220.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/032_TapOn_YesProceed'), 0)

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Storing the pin inside a variable
def otpText3 = Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Applying the read pin from keyboard
otpText3 = otpText3.replace('Your PIN no. is ', '')

def otpArr3 = otpText3.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr3.length; i++) {
	if ((otpArr3[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr3[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr3[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr3[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr3[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr3[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr3[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr3[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr3[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr3[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6742546852739749705.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/027_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/033_VerifyText - Welcome Onboard'), 'Welcome Onboard')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/034_VerifyText - How would you like us to address you'),
	'How would you like us to address you?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3621521046637486903.png')

Mobile.setText(findTestObject('Object Repository/Onboarding/035_SetText - Enter your name'), 'AndroidTest', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7890568104181927601.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/036_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/037_VerifyText- Set Primary Account'), 'Set Primary Account')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1475302316606582214.png')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/038_VerifyText- Personal Current Account'), 'Personal Current Account')

Mobile.tap(findTestObject('Object Repository/Onboarding/039_Select - Personal Current Account'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6104107336600527711.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/040_TapNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/041_VerifyText- Are you a new Maybank customer'),
	'Are you a new Maybank customer?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4978627027910386006.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/042_TapOn - Skip'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/043_VerifyText - Set Up Successful'), 'Set Up Successful')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/044_VerifyText- Youre all set to enjoy the app. Activate Secure2u now for a safer way to approve your online transactions'),
	'You\'re all set to enjoy the app. Activate Secure2u now for a safer way to approve your online transactions.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2787020864858437360.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/045_TapOnActuvateS2U'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/046_VerifyText - Secure2u'), 'Secure2u')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2070230083547284354.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/047_TapOnRegisterS2U'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/048_VerifyText - Get a 6-digit OTP to authorise your transaction'),
	'Get a 6-digit OTP to authorise your transaction.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7374908614461110442.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/049_TapOn_RequestOTPButton'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6125053430930769234.png')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/050_VerifyText - Enter OTP sent to you'), 'Enter OTP sent to you')

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Storing the pin inside a variable
def otpText4 = Mobile.getText(findTestObject('Object Repository/Onboarding/026_GetOTP- Your PIN no. is 111111'), 0)

//Applying the read pin from keyboard
otpText4 = otpText4.replace('Your PIN no. is ', '')

def otpArr4 = otpText4.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr4.length; i++) {
	if ((otpArr4[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr4[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr4[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr4[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr4[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr4[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr4[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr4[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr4[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr4[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6742546852739749705.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/027_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/051_VerifyText - Enter your ID number'), 'Enter your ID number')

Mobile.setText(findTestObject('Object Repository/Onboarding/052_Set_MyKad_Number - Your ID number'), '031215105237', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1906345995220384766.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/053_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/054_VerifyText- Device Name'), 'Device Name')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/055_VerifyText - Secure2u will be linked to this device'),
	'Secure2u will be linked to this device')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1132486705639999912.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/056_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/057_VerifyText - Secure2u activated'), 'Secure2u activated')

Mobile.verifyElementText(findTestObject('Object Repository/Onboarding/058_VerifyText - You may now authorise your transactions securely via the app'),
	'You may now authorise your transactions securely via the app.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2785600143848874827.png')

Mobile.tap(findTestObject('Object Repository/Onboarding/059_TapOnDone'), 0)

