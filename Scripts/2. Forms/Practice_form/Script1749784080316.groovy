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

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Forms/forms_menu'))

WebUI.click(findTestObject('Forms/practice_form_submenu'))

WebUI.scrollToPosition(0, 390)

WebUI.setText(findTestObject('Forms/first_name_txt'), 'coffee')

WebUI.setText(findTestObject('Forms/last_name_txt'), 'latte')

WebUI.setText(findTestObject('Forms/email_txt'), 'coffee.latte@gmail.com')

WebUI.delay(2)

WebUI.check(findTestObject('Forms/male_rb'))

WebUI.setText(findTestObject('Forms/mobile_number_txt'), '085678978474')

WebUI.delay(2)

//DATE OF BIRTH
WebUI.scrollToElement(findTestObject('Forms/date_of_birth_txt'), 0)

WebUI.click(findTestObject('Forms/date_of_birth_txt'))

WebUI.delay(2)

WebUI.click(findTestObject('Forms/date_month_year_txt'))

WebUI.delay(2)

//------------------------------------------
//SUBJECT
WebUI.scrollToElement(findTestObject('Forms/subjects_txt'), 0)

WebUI.setText(findTestObject('Forms/subjects_txt'), 'Economics')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Forms/subjects_txt'), Keys.TAB.toString())

WebUI.delay(2)

//------------------------------------------
WebUI.check(findTestObject('Forms/reading_cb'))

WebUI.delay(2)

WebUI.check(findTestObject('Forms/music_cb'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Forms/choose_file_upload'), '/Users/elhum/Documents/HRSV/Bocah-AI.jpg')

WebUI.setText(findTestObject('Forms/current_address_txtArea'), 'jalan pahlawan pelajar')

WebUI.delay(1)

//STATE AND CITY
WebUI.scrollToElement(findTestObject('Forms/select_state_option'), 0)

WebUI.setText(findTestObject('Forms/select_state_option'), 'Haryana')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Forms/select_state_option'), Keys.TAB.toString())

WebUI.delay(1)

WebUI.setText(findTestObject('Forms/select_city_option'), 'Panipat')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Forms/select_city_option'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Forms/submit_btn'))

WebUI.delay(2)

WebUI.verifyTextPresent('Thanks for submitting the form', false)

WebUI.delay(2)

WebUI.closeBrowser()

