import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Clicking on insert button'
WebUI.click(findTestObject('Event Group Managemnt/BTN_Insert'))

'Inserting data in form fields \r\n'
CustomKeywords.'pk_Functions.CS_AllPageData.AllPageDataFun'('Event Group Management/MOF_NE_Event Group ManagementObjectRepository', 
    'Sheet1', [code, arabic_des, english_des])

'Clicking on Save \r\n'
WebUI.click(findTestObject('BTN_Save'))

WebUI.delay(3)

'Clicking on Back '
WebUI.click(findTestObject('Event Group Managemnt/BTN_Back (1)'))

WebUI.delay(3)

