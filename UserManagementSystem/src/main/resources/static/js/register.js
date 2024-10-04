
/* 入社日 設定 */
document.getElementById('nyuusyaDate').value = new Date().toISOString().substring(0, 10);
/* 退社日 設定 */
document.getElementById('taisyaDate').value = new Date().toISOString().substring(0, 10);


/* 登録 button */
document.getElementById('btn').addEventListener('click', clickButton);

function clickButton() {
	validateStaffCode();
	validateStaffName();
	validateBankCode();
	validateBranchCode();
	validateAccountNum();
	validateTextArea();
	
}


/* staff_code 確認 */
function validateStaffCode() {
    var staffcode = document.getElementById('syainId').value;
    // 正規式を使用して、「A-Z」、「a-z」、「0-9」の範囲にあることを確認するパターン
    var pattern = /^[A-Za-z0-9]+$/;

    if (staffcode === "") {
        alert("社員コードを入力お願いします。");
        return false;
    } 
    if (!pattern.test(staffcode) || staffcode.length > 10) {
        alert("社員コードの再入力をお願いします。\n *A-Z、a-z、0-9で構成され、10文字以内でなければなりません。");
        return false;
    }
    return true; 
}

/* staff_lastname, staff_firstname 確認 */
function validateStaffName() {
    var stafflastname = document.getElementById('firstNameKanji').value;	
    var stafffirstname = document.getElementById('lastNameKanji').value;	
    
    if (stafflastname === "" || stafffirstname === "") {
        alert("社員名を入力お願いします");
        return false;
    }
    if (stafflastname.length >=15 || stafffirstname.length >=15) {
    	alert("社員名の再入力をお願いします。 \n *15文字以内でなければなりません。 ");
    	return false;
    }
     return true; 

}

/* bank_code2 確認 */
function validateBankCode() {
    var bankcode = document.getElementById('bank_code2').value;	
    
  if (bankcode.trim() === "" || isNaN(bankcode)) {
        alert("金融機関コードの入力をお願いします。 \n *数字でなければなりません。");
        return false;
    }
	return true; 
}

/* branch_code2 確認 */
function validateBranchCode() {
    var branchcode = document.getElementById('branch_code2').value;	
    
  if (branchcode.trim() === "" || isNaN(branchcode) ) {
        alert("支店名コードの入力をお願いします。 \n *数字でなければなりません。");
        return false;
    }
	return true; 
}

/* account_num 確認 */
function validateAccountNum() {
    var accountnum = document.getElementById('kouzaNum').value;	
    
  if (accountnum.trim() === "" || isNaN(accountnum) ) {
        alert("口座番号の入力をお願いします。 \n *数字でなければなりません。");
        return false;
    }
    return true; 

}

/* textarea 確認 */
function validateTextArea() {
    var textarea = document.getElementById('itBikou').value;	
    
    if (textarea.length >=1024) {
    	alert("備考及びご自分で己アピールをもう一度ご入力お願いします。 \n *1024文字以内でなければなりません。 ");
    	return false;
    }
     return true; 

}









