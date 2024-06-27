let fieldsChecks=
{
         "name":false,
		"id":false,
		"select":false,
		"amount":false,
		 "rechargetype":false,
         "accept":false
         
	}

function validateAndEnableSubmit()
{
    let flag = false;

    for(let [key, value] of Object.entries(fieldsChecks))
    {

        if(value === false)
        {
            flag = true;
            break;
        }
    }

    if(!flag)
    {
        document.getElementById("submit").removeAttribute("disabled");
    }else
    {
        document.getElementById("submit").setAttribute("disabled","");
    }
}

//Customer Name
function customerNameValidation() {
                let element = document.getElementById("name");
                let error = document.getElementById("errorName");
                let nameRegex = /^[A-Za-z]+$/;

                if (element.value.length > 3 && element.value.length < 30 && nameRegex.test(element.value)) {
                    error.innerHTML = "";
                    fieldsChecks["name"] = true;
                } else {
                    error.innerHTML = "Invalid name. Name should be alphabetic characters only and length should be greater than 3 and less than 30.";
                    error.style.color = "red";
                    fieldsChecks["name"] = false;
                }
                validateAndEnableSubmit();
            }



//customerId

function customerIdValidation()

{
    let element = document.getElementById("id");
    let error = document.getElementById("errorId");
    console.log(element);
    console.log(element.value);
    console.log(error);

    if(element.value.trim().length == 8){
        error.innerHTML = "";
        fieldsChecks["id"] = true;
    }else{
        error.innerHTML = "Invalid Customer ID. ID should be 8 character long";
        error.style.color="red"
        fieldsChecks["id"] = false;
        
}
    validateAndEnableSubmit();
}

	
	//here write select vendor
	
	
 function vendorValidation() 
	
{
	let element = document.getElementById("select");
    let error = document.getElementById("vendorerror");

    if(element.value.length != "0"){
        error.innerHTML = "";
        fieldsChecks["select"] = true;
    }
    else{
        error.innerHTML = "  Please select vendor";
        error.style.color="red"
        fieldsChecks["select"] = false;
        
}
    validateAndEnableSubmit();
		
		
}


//Recharge amount

function  buy()
	{
		
		
		let error=document.getElementById("errorrechargetype");
		
		if(document.recharge.rechargetype[0].checked==false &&
				document.recharge.rechargetype[1].checked==false	&&
				document.recharge.rechargetype[2].checked==false)
			{
			
			error.innerHTML="Please select any paymemt method";
		error.style.color='red';
		 fieldsChecks["rechargetype"] = false;
	}
	
	else{
		error.innerHTML="";
		 fieldsChecks["rechargetype"] = true;

		
		}
	
    validateAndEnableSubmit()
}

	//Recharge type
	
	
function amountValidation()
	
	{
    let element = document.getElementById("amount");
    let error = document.getElementById("erroramount");
    let amount = element.value == "" ? 0 : parseInt(element.value);

    if(amount >= 10 && amount <= 10000){
        error.innerHTML = "";
        fieldsChecks["amount"] = true;
    }else{
        error.innerHTML = "Recharge amount shoubld be 10 to 10,000";
        error.style.color="red"
        fieldsChecks["amount"] = false;
    }
    validateAndEnableSubmit();
   
}
	
//vendor
function vendorValidation() 

{
	let element = document.getElementById("select");
    let error = document.getElementById("vendorerror");

    if(element.value.length != "0"){
        error.innerHTML = "";
        fieldsChecks["select"] = true;
    }else{
        error.innerHTML = "  Please select vendor";
        error.style.color="red"
        fieldsChecks["select"] = false;
        
}
    validateAndEnableSubmit();
    
		
}	

//accept
	function acceptValidation()
	
	{
		
		let element = document.getElementById("accept");
		    let error = document.getElementById("erroraccept");

		    if(element.checked)
		    {
		        error.innerHTML = "";
		        fieldsChecks["accept"] = true;
		    }else
		    {
		        error.innerHTML = "Please confirm";
		        error.style.color="red"
		        fieldsChecks["accept"] = false;

		    }
		    validateAndEnableSubmit();
		    console.log(element.value);
		    buy();
			
		
	}	
