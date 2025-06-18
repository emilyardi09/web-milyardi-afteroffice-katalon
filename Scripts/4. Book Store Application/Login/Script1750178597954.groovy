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

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Book Store Application/bookStoreAplication_menu'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Book Store Application/login_submenu'))

WebUI.scrollToPosition(0, 300)

WebUI.setText(findTestObject('Book Store Application/userName_txt'), 'eiffelcake')

WebUI.setEncryptedText(findTestObject('Book Store Application/password_txt'), '+acxczy8po9/c2VA3HNXfmdfSZNhcR1l')

WebUI.click(findTestObject('Book Store Application/login_btn'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Book Store Application/log_out_btn'))

WebUI.verifyTextPresent('Login', false)

WebUI.delay(2)

WebUI.closeBrowser()

