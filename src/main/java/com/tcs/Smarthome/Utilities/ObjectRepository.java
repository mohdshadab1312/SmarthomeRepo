package com.tcs.Smarthome.Utilities;

public class ObjectRepository {

	//Login into V-App
	protected String loginPageVodafoneIcon = "(//*[@id='welcome_fl_animation_container']/*[@class='android.widget.ImageView'])[2]";
	protected String vappLoginBtn = "//*[@text='Los geht‘s']";
	protected String countryCodeListBtn = "//*[@class='android.widget.Spinner']";
	protected String countryCode_DE = "//*[@class='android.view.View' and @height>0 and ./*[@text='+49 Germany']]";
	protected String phoneNumberTextBox = "//*[@id='vfcddnumber0']";
	protected String continueBtn = "//*[@id='continueButton']";	
	protected String enterPINTextBox = "//*[@id='seamlessid-pin']";
	protected String loginContinueBtn = "xpath=//*[@id='validatePin']";
	protected String firstHomePageTitle = "//*[@text='Mein V by Vodafone']";
	protected String firstHomePagePlusSign = "//*[@id='home_fab']";
	protected String homePageText = "//*[@text='Entdeck die Welt von V by Vodafone und füg Dein erstes Gerät hinzu']";
	protected String scanPageTitle = "//*[@class='android.widget.TextView' and ./parent::*[@id='toolbar']]";
	protected String scanPageQRCodeButton = "//*[@id='add_device_select_method_bt_scan']";
	protected String scanPageAddDeviceButton = "//*[@text='Produkt-Nummer eingeben']";
	protected String addDevicePageTitle = "//*[@class='android.widget.TextView' and ./parent::*[@id='toolbar']]";
	protected String addDevicePageTextBox = "//*[@id='add_device_manual_et_imei']";
	protected String addDevicePageBestatigenButton = "//*[@id='add_device_manual_bt_submit']";
	protected String addingDeviceInProgress = "//*[@id='add_device_identified_ll_container']";
	protected String addedDevicesIdentifiedPageHomeIcon = "//*[@id='add_device_identified_icon']";
	protected String addedDevicesIdentifiedPageVHomeTitle = "//*[@id='add_device_identified_name']";
	protected String addedDevicesIdentifiedPageProductNumber = "//*[@id='add_device_identified_imei']";
	protected String addedDevicesIdentifiedPageBestatigenButton = "//*[@id='add_device_btn_confirm']";
	protected String primeContactPageTitle = "//*[@class='android.widget.TextView' and @height>0 and ./parent::*[@id='toolbar']]";
	protected String primeContactPageName = "//*[@id='v_home_configuration_et_name']";
	
	//Logout
	protected String FinalHomePage_Title = "//*[@text and @height>0 and ./parent::*[@id='toolbar']]";
	protected String FinalHomepage_MoreoptionsIcon = "//*[@contentDescription='More options']";
	protected String HomePageMoreoptions_MyAccountOption = "//*[@text='Mein Konto']";
	protected String HomepageMoreoptionsPage_LogoutBtn = "//*[@id='my_account_bt_logout']";
	protected String LogoutConfirmBtn = "//*[@id='custom_dialog_positive_button']";
	
	//Version
	protected String VAppMenu_VByVodafoneOption = "(//*[@class='android.widget.ListView']/*[./*[@class='android.widget.RelativeLayout']])[2]";
	protected String VAppMenu_UserVByVodafone_VersionLink = "//*[@id='about_smartlife_app_version_ll']";
	protected String VAppMenu_UserVByVodafone_Version = "//*[@id='about_smartlife_app_version_tv']";
	
	//FAQ
	protected String HelpnSupportBtn = "//*[@id='nav_support']";
	protected String FAQ_VHomeLink = "//*[@text='V-Home']";
	protected String FAQ_VHomeArticleLink = "//*[@id='faq-mobile-f651b8c2e000']";
	protected String FAQ_VHomeArticleContent = "//*[@id='faq-mobile-f651b8c2e000']";
	
	//Goto Smartthings App
	protected String FinalHomePage_AddedDeviceIcon = "//*[@id='home_ll_device_list_item_container']";
	protected String DeviceDetailsPage_SmartthingsLink = "//*[@class='android.widget.LinearLayout' and @height>0 and ./*[@id='device_details_device_app_icon']]";
	protected String SmartThingsWifiPopUp_Title = "//*[@id='alertTitle']";
	protected String SmartThingsHomePage_Title = "//*[@contentDescription='SmartThings']";
	
	//QR Scan
	protected String ScanPage_Title = "/*[@class='android.widget.TextView' and ./parent::*[@id='toolbar']]";
	protected String ScanPage_QRCodeButton = "//*[@id='add_device_select_method_bt_scan']";
	protected String QRScanPage_Title = "//*[@class='android.widget.TextView' and ./parent::*[@id='toolbar']]";
	protected String QRScanPage_CameraContent = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@contentDescription='Help icon']]]";
	
	//Modify contacts PC and TC
	protected String DeviceDetailsPage_PrimaryDetails = "//*[@class='android.widget.LinearLayout' and @height>0 and ./*[@class='android.widget.LinearLayout' and ./*[@text='Hauptkontakt']] and ./*[@class='android.widget.ImageView']]";
	protected String PrimeContactPage_Title = "//*[@class='android.widget.TextView' and @height>0 and ./parent::*[@id='toolbar']]";
	protected String PrimeContactPage_Name = "//*[@id='v_home_configuration_et_name']";
	protected String PrimeContactPage_SurName = "xpath=//*[@id='v_home_configuration_et_surname']";
	protected String PrimeContactPage_Contact = "//*[@id='v_home_configuration_et_mobile']";
	protected String PrimeContactPage_SpeichernButton = "//*[@id='v_home_configuration_bt_save']";

	protected String DeviceDetailsPage_TrustedDetails = "//*[@class='android.widget.LinearLayout' and @height>0 and ./*[@class='android.widget.LinearLayout' and ./*[@id='device_details_tv_v_home_contacts_cell_title']] and ./*[@class='android.widget.ImageView']]";
	protected String ContactDetailsPage_PlusSign = "//*[@id='emergency_contacts_configuration_list_cell_ll_add_contact_button']";
	protected String AddTrustedContactBtn = "//*[@id='emergency_contacts_list_bt_add_contact_manually']";
	protected String PermissionPage_YullassenBtn = "//*[@id='permissions_bt_positive']";
	protected String PermissionPopUp_Allow = "//*[@id='permission_allow_button']";
	protected String TrustedContactPage_Title = "//*[@class='android.widget.TextView' and ./parent::*[@id='toolbar']]";
	protected String TrustedContactPage_Name = "//*[@id='emergency_contacts_manually_et_name']";
	protected String TrustedContactPage_Contact = "//*[@id='emergency_contacts_manually_et_mobile']";
	protected String TrustedContactPage_Relation = "//*[@id='emergency_contacts_manually_et_relationship']";
	protected String TrustedContactPage_DeleteBtn = "//*[@id='emergency_contacts_manually_bt_save']";
	protected String ContactDetailsPage_SaveBtn = "//*[@id='emergency_contacts_configuration_bt_update']";
	protected String ContactDetailsPage_1stTrstedContactDetails = "//*[@id='emergency_contacts_configuration_list_cell_ll_container']";

	
}
