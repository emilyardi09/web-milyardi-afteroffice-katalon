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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlDemoqa)

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Elements/elements_menu'))

WebUI.click(findTestObject('Elements/Text_box/textBox_subMenu'))

WebUI.verifyTextPresent('Text Box', false)

WebUI.setText(findTestObject('Elements/Text_box/fullName_txt'), 'Pink')

WebUI.setText(findTestObject('Elements/Text_box/email_txt'), 'pink_black@gmail.com')

WebUI.setText(findTestObject('Elements/Text_box/currentAddress_txt'), 'Jl. Prapanca Raya No. 9, Jakarta Selatan, Indonesia 12170')

WebUI.setText(findTestObject('Elements/Text_box/permanentAddress_txt'), 'JI. Laksda Yos Sudarso 27 -29 Tanjung Priok, Jakarta Utarat')

WebUI.click(findTestObject('Elements/Text_box/submit_btn'))

WebUI.delay(3)

WebUI.closeBrowser()

