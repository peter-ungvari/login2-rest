$(function() {
	
	$("form[name=loginForm]").submit(function(event) {
		event.preventDefault();
		$("div.alert").removeClass("alert-error");
		var requestData = $(this).serialize();
		$.post("rest/login/", requestData, function(responseData) {
			if(responseData.success) {
				$("div.alert").hide();
				window.location = "content.html?token="+responseData.token;
			} else {
				$("div.alert .title").text("Sikertelen");
				$("div.alert .message").text("Hibás felhasználónév vagy jelszó.");
				$("div.alert").show();
			}
		}).fail(function() {
			$("div.alert .title").text("Hiba");
			$("div.alert .message").text("Szerver oldali hiba történt.");
			$("div.alert").addClass("alert-error").show();
		});
	});

});