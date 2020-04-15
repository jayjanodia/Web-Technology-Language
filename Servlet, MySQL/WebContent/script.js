//Application: Pizza Order



var modal = document.getElementById("id01");

// When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
        modal.style.display = "none";
        }
	}
	
function ValidateEmail(inputText)
{
        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if(inputText.value.match(mailformat))
        {	
        	//alert("LOGIN SUCCESSFUL");
	        return true;
        }
        else
        {
	        alert("You have entered an invalid email address!");
	        return false;
        }
}
 function myAlert(){
 		
            var name = document.getElementById("Name").value;
            var mobile = document.getElementById("Phone").value;
            var email = document.getElementById("email").value;
            var password = document.getElementById("psw").value;
            var repeat = document.getElementById("psw-repeat").value;
            var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
            var message = "SIGN UP SUCCESSFUL";
			var messageName = null;
			var mobileVal = null;
            var message1 = null;
            var message2 = null;

            
            /*if(name == "") {
                name.style.border = "1px solid red";
                name.focus();
                return false;
            }*/
			if(name.length < 8) {
				messageName = "Please enter a username greater than 8 characters\n";
				return false;
			}
			if(mobile.length !=10) {
				mobileVal = "Invalid mobile number entered, please enter correct mobile number\n";
				return false;
			}
            if(!email.match(mailformat))
            {
                message1 = "You have entered an invalid email address!\n";
                return false;
            }
            if(password != repeat) {
                message2="Entered Passwords do not match\n"; 
                return false;
            }
            else {
                    if(password.length <8) {
                        message2="Password should be of 8 characters or more\n"; 
                        return false;
                    }
            }
			if(messageName != null || mobileVal != null || message1 != null || message2 != null)
					message = messageName + mobileVal + message1 + message2;
            alert(message);
}



/*window.onscroll = function() {myFunction()};

var navbar = document.getElementById("close");
var sticky = close.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky) {
    close.classList.add("sticky")
  } else {
    close.classList.remove("sticky");
  }
}
var c = function(pos) {
    var lat = pos.coords.latitude,
        long = pos.coords.longitude,
        coords = lat +','+ long;
    document.getElementById('google_map').setAttribute('src','https://maps.google.co.in?q=' + coords +'&z=60&output=embed');
}

document.getElementById('get_location').onClick = function() {
    navigator.geolocation.getCurrentPosition(c);
    return false; 
}*/
