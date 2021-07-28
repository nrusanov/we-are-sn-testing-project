package constants;

import org.openqa.selenium.devtools.v84.indexeddb.model.Key;

import java.nio.file.Paths;

public interface Constants {

    final int TIMEOUT_SECONDS = 10;
    final String FIRST_USER_USERNAME = "randomUsername";
    final String SECOND_USER_USERNAME = "randomSecondUsername";
    final String EMAIL_FIRST_USER = "Neptunus.qa21@gmail.com";
    final String EMAIL_SECOND_USER = "Neptunus.qa21@gmail.com";
    final String PASSWORD_FIRST_USER = "Neptunus_21";
    final String PASSWORD_SECOND_USER = "Neptunus_21";
    final String CONFIRM_PASSWORD_FIRST_USER = "Neptunus_21";
    final String CONFIRM_PASSWORD_SECOND_USER = "Neptunus_21";
    final String FIRST_NAME = "Team";
    final String LAST_NAME_FIRST_USER = "NeptunusOne";
    final String LAST_NAME_SECOND_USER = "NeptunusTwo";
    final String BIRTHDAY_DATE = "02022020";
    final String BIRTHDAY_DATE_ASSERT = "2020-02-02";
    final String DROP_FEW_WORDS_FIELD = "We are future QA masters";
    final String GENDER = "FEMALE";
    final String CITY = "Plovdiv";
    final String PROFESSIONAL_CATEGORY = "Actor";
    final String PROFESSIONAL_CATEGORY_SECOND_USER = "Dentist";
    final String SKILL_FIRST = "skill1";
    final String SKILL_SECOND = "skill2";
    final String SKILL_THIRD = "skill3";
    final String SKILL_FOURTH = "skill4";
    final String SKILL_FIFTH = "skill5";
    final String WEEKLY_AVAILABILITY = "15.0";
    final String WEEKLY_AVAILABILITY_FULL_TEXT = WEEKLY_AVAILABILITY + " hours/weekly";
    final String PROFILE_PRIVACY = "public";
    final String USER_PICTURE = "\\src\\test\\resources\\images\\Neptunus.jpg";
    final String POST_PICTURE = "\\src\\test\\resources\\images\\QA.png";
    final String USER_DIRECTORY = Paths.get("")
            .toAbsolutePath()
            .toString();
<<<<<<< HEAD
    final String USER_PROFILE_PICTURE = USER_PICTURE + USER_DIRECTORY;
    final String POST_PROFILE_PICTURE = POST_PICTURE + USER_DIRECTORY;
=======
    final String USER_PROFILE_PICTURE = USER_DIRECTORY + USER_PICTURE;
    final String POST_PROFILE_PICTURE = USER_DIRECTORY + POST_PICTURE;
>>>>>>> b8b1ec8dc7af684c33cbb14cf7ce70b3150b308c

    final String ADMIN_USERNAME = "adminRandom";
    final String ADMIN_EMAIL = "Neptunus.qa21@gmail.com";
    final String ADMIN_PASSWORD = "Neptunus_21";
    final String ADMIN_CONFIRM_PASSWORD = "Neptunus_21";
    final String ADMIN_LAST_NAME = "NeptunusAdmin";

//    final String HOME_KEY = sendKeys (key.Home);

}
