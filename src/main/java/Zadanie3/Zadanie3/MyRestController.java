package Zadanie3.Zadanie3;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	public static final Logger logger = LoggerFactory.getLogger(MyRestController.class);
	UserPositionRepository repositories=new UserPositionRepository();
	@RequestMapping(value="/localization", method = RequestMethod.POST)
	public HttpEntity<String> setUsersLocalization(@RequestBody UserPosition asJson) {	
		repositories.addUserData(asJson);
		String response="You position has been written";
		UserPosition user=repositories.getRandomUser();//Randomowy użytkownik z listy
		HttpHeaders headers=new HttpHeaders();
		//headers.setContentType(MediaType.APPLICATION_JSON);
		logger.info("----------------------------------------------");
		logger.info("info - deviceID: {}", asJson.getDeviceId());
		logger.info("info - latitiude: {}",asJson.getLatitiude());
		logger.info("info - longitude: {}", asJson.getLongitude());
		logger.info("length of list of System's users : {}", repositories.listOfUsers.size());
		logger.info("-----------------------------------------------");
		logger.info("----------------------------------------------");
		logger.info("info - deviceID: {}", user.getDeviceId());
		logger.info("info - latitiude: {}",user.getLatitiude());
		logger.info("info - longitude: {}", user.getLongitude());
		logger.info("-----------------------------------------------");
		logger.info("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		return new HttpEntity<String>(response);
	}
}
