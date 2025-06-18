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

WebUI.click(findTestObject('Alerts Frame and Windows/Alerts/alertFrameWindows_menu'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Alerts Frame and Windows/Alerts/alerts_submenu'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 300)

//Click Button to see alert
WebUI.click(findTestObject('Alerts Frame and Windows/Alerts/alertButton_btn'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

//On button click, alert will appear after 5 seconds
WebUI.delay(4)

WebUI.click(findTestObject('Alerts Frame and Windows/Alerts/timerAlertButton_btn'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

//On button click, confirm box will appear, Cancel or OK
WebUI.click(findTestObject('Alerts Frame and Windows/Alerts/confirmButton_btn'))

WebUI.waitForAlert(5)

WebUI.dismissAlert( //klik button cancel
    )

//WebUI.acceptAlert() //klik button OK
WebUI.delay(4)

//On button click, prompt box will appear
WebUI.click(findTestObject('Alerts Frame and Windows/Alerts/promtButton_btn'))

WebUI.waitForAlert(5)

WebUI.setAlertText('After Office')

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.closeBrowser()

