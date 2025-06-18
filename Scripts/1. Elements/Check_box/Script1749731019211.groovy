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

WebUI.click(findTestObject('Elements/Check_box/checkBox_subMenu'))

WebUI.verifyTextPresent('Check Box', false)

WebUI.click(findTestObject('Elements/Check_box/expand_all_btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Elements/Check_box/collapse_all_btn'))

WebUI.delay(2)

WebUI.check(findTestObject('Elements/Check_box/toggle_btn'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Elements/Check_box/toggle_btn'))

WebUI.delay(2)

WebUI.check(findTestObject('Elements/Check_box/toggle_btn'))

WebUI.delay(2)

WebUI.check(findTestObject('Elements/Check_box/home_cbk'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Elements/Check_box/home_cbk'))

WebUI.delay(5)

WebUI.closeBrowser()

