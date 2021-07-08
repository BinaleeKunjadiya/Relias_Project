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

WebUI.navigateToUrl(findTestData('InputList').getValue("url",1))

WebUI.click(findTestObject('Page_OrgApp/Recruiter_List_Invite_Button'))

WebUI.setText(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), 'abc@gmail.com')

WebUI.sendKeys(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), 'abc1@gmail.com')

WebUI.sendKeys(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), 'abc3@gmail.com')

WebUI.sendKeys(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), 'abc4@gmail.com')

WebUI.sendKeys(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Email_Textbox'), 'abc5@gmail.com')

WebUI.click(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Add_Button'))

WebUI.click(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Remove_Clickable'))

WebUI.click(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Remove_Clickable'))

WebUI.click(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_RemoveAll_Clickable'))

WebUI.click(findTestObject('Page_OrgApp/Object_Invite_Recruiter_popup/Invite_Recruiter_Close'))

WebUI.closeBrowser()
