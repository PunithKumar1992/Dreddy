/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.36-community : Database - dayananda_reddy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dayananda_reddy` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dayananda_reddy`;

/*Table structure for table `coloradminregistration` */

DROP TABLE IF EXISTS `coloradminregistration`;

CREATE TABLE `coloradminregistration` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_email` varchar(255) DEFAULT NULL,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  `admin_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `coloradminregistration` */

/*Table structure for table `dreddyadminregestration` */

DROP TABLE IF EXISTS `dreddyadminregestration`;

CREATE TABLE `dreddyadminregestration` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) DEFAULT NULL,
  `admin_email` varchar(30) DEFAULT NULL,
  `admin_phone` varchar(20) DEFAULT NULL,
  `admin_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `dreddyadminregestration` */

insert  into `dreddyadminregestration`(`admin_id`,`admin_name`,`admin_email`,`admin_phone`,`admin_password`) values (1,'dreddy','punithkumar325@gmail.com','9876655443','123456');

/*Table structure for table `dreddyarticle` */

DROP TABLE IF EXISTS `dreddyarticle`;

CREATE TABLE `dreddyarticle` (
  `article_id` mediumint(250) NOT NULL AUTO_INCREMENT,
  `article_caption` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `article_brief` mediumtext COLLATE utf8_unicode_ci,
  `article_image` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `article_detail` longtext COLLATE utf8_unicode_ci,
  `article_by` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `article_date` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `article_gridimage` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `article_comments` mediumint(250) DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `dreddyarticle` */

insert  into `dreddyarticle`(`article_id`,`article_caption`,`article_brief`,`article_image`,`article_detail`,`article_by`,`article_date`,`article_gridimage`,`article_comments`) values (1,'<p style=\'text-align: justify;text-decoration: none;color: #f57c20;\'>Educating Immigrants on Culture</p>','<p style=\'text-align: justify;\'>Bengaluru and other such similar cosmopolitan cities has a high percentage of immigrants, who are educated but need to be sensitized about local language, culture and its heritage.</p>','blog3.jpg','<p style=\'text-align: justify;\'>Bengaluru and other such similar cosmopolitan cities has a high percentage of immigrants, who are educated but need to be sensitized about local language, culture and its heritage.</p><br/><p style=\'text-align: justify;\'>Sensitizing them at a very initial stage even before they make the city there home either educating them in there office level or Ward level would resolve a lot of confusion and build mutual respect and trust between the local residents and the immigrants.</p><br/><p style=\'text-align: justify;\'>Even though this is a small initiative if the same is implemented in the right direction this is sure to bear results on a longer run in creating a cultural harmony amongst citizens of various states in the country.</p><br/>','Dayananad','Mon May 14 2018','blogimg3.jpg',0),(2,'<p style=\'text-align: justify;text-decoration: none;color: #f57c20;\'>Contribution towards Social Welfare</p>','<p style=\'text-align: justify;\'>Organized cultural competitions, indoor and outdoor sports and promoted educational seminars to promote extracurricular activities. He has also donated push carts for vegetable vendors.</p>','blog4.jpg','<p style=\'text-align: justify;\'>Organized cultural competitions, indoor and outdoor sports and promoted educational seminars to promote extracurricular activities.</p><br/><p style=\'text-align: justify;\'>He has also donated push carts for vegetable vendors to help their livelihood and provided drinking water to remote villages through bore wells.</p><br/><p style=\'text-align: justify;\'>After completing his basic education, he initiated his professional career as the Head of Sales & Marketing at Legacy Global Projects Pvt. Ltd. where he immersed himself completely for 8 years (2007 - 2015) and got a firm grip on every nuance of organized productive activity and the need to equip ourselves with the nuances of contemporary corporate etiquette and in inculcating the ability to be on par with global standards.</p><br/><p style=\'text-align: justify;\'>Since then he is been proactively engaged in numerous activities like Free Education, Free medical Camps, Donation of wheel Chairs to Handicapped, planting trees etc.</p><br/><p style=\'text-align: justify;\'>(DF) has made a remarkable contribution towards community development since its inception. Mr. Dayananda- Founder of DF and Chairman of Bharath Goldstar Group (BGG) developed interest in social activities and community development at a very young age.</p><br/>','Dayananad','Sun May 27 2018','blogimg4.jpg',1),(3,'<p style=\'text-align: justify;text-decoration: none;color: #f57c20;\'>Threefold developmental activity</p>','<p style=\'text-align: justify;\'>Active eradication of poverty, taking a strong policy decision to decapitate anti-social elements affecting lives of the largely well behaved public.The focused promotion of education, health & etc. </p>','blog5.jpg','<p style=\'text-align: justify;\'>Indulging in varied developmental activities: viz., providing basic amenities and support system like water, electricity, commodities and transport at reasonable costs.</p><br/><p style=\'text-align: justify;\'>The focused promotion of education, health, art and culture, along with better public amenities (Parks, recreational facilities, elder care homes, etc.)</p><br/><p style=\'text-align: justify;\'>Active eradication of poverty, taking a strong policy decision to decapitate anti-social elements from adversely affecting the lives of the largely well behaved public.</p><br/><p style=\'text-align: justify;\'>Every day we are witness to many aspects that bring out the best in humans and also many aspects that show us how much more he can debase himself by his unspeakable actions.</p><br/>','Dayananad','Wed Jun 13 2018','blogimg5.jpg',0),(4,'<p style=\'text-align: justify;text-decoration: none;color: #f57c20;\'>Current Issues in Developing Cities</p>','<p style=\'text-align: justify;\'>Currently there are a lot of Issues governing developing cities like Bengaluru. There are a lot of Conservative Politicians and NGOâ??s who are finding solutions to resolve these issues.</p>','blog6.jpg','<p style=\'text-align: justify;\'>Currently there are a lot of Issues governing developing cities like Bengaluru. There are a lot of Conservative Politicians and NGOâ??s who are finding solutions to resolve these issues.</p><br/><p style=\'text-align: justify;\'>Concerns like Urban Planning, Social Security, Public Transport, Job Opportunity, Health Care, Water and Sanitation, Garbage Disposal, Education, Increase in Population, Pollution, Power likewise there are a lot of other concerns which has to be addressed with immediate effect.</p><br/><p style=\'text-align: justify;\'>Including these issues I would also like to address and implement some basic concerns even though these initiatives are smaller but on the longer run it would be very beneficial for the society.</p><br/>','Dayananad','Thu May 17 2018','blogimg6.jpg',0),(5,'<p style=\'text-align: justify;text-decoration: none;color: #f57c20;\'>Support for Quality Education</p>','<p style=\'text-align: justify;\'>The idea of this project is to provide 3 years of high school education i.e. 8th, 9th, 10th and after which technical education based on the requirement of more than 500 affiliated industries to ensure</p>','blog2.jpg','<p style=\'text-align: justify;\'>The idea of this project is to provide 3 years of high school education i.e. 8th, 9th, 10th and after which technical education based on the requirement of the more than 500 affiliated industries to ensure</p>','Dayananad','Thu May 10 2018','blogimg2.jpg',0),(10,'<p style=\'text-align: justify;text-decoration: none;color: #f57c20;\'>Dayananda Reddy Foundation</p>','<p style=\'text-align: justify;\'>Dayananda Foundation is a CSR initiative of Bharath Goldstar Group. The Foundation adopts students from the age group of 14 and is supporting them with 3 years of High School Education.</p>','blog1.jpg','<p style=\'text-align: justify;\'>Dayananda Reddy is one such rare conscientious individual who has done everything in his means to make society a better place. He believes in the ability of each and every citizen and collective will that will bring together the efforts of innumerable such well-meaning individuals and bring about the change that everyone welcomes.</p><br/><p style=\'text-align: justify;\'>His contributions to society, mainly to students began due to the hardships that he faced to get academic accreditation. The struggle that he faced to complete his education was in a way responsible for him to be the cause for thousands of students to be aided by his philanthropic grants and thus be spared the same struggle to them to get educated.</p><br/><p style=\'text-align: justify;\'>After completing his basic education, he initiated his professional career as the Head of Sales & Marketing at Legacy Global Projects Pvt. Ltd. where he immersed himself completely for 8 years (2007 - 2015) and got a firm grip on every nuance of organized productive activity and the need to equip ourselves with the nuances of contemporary corporate etiquette and in inculcating the ability to be on par with global standards.</p><br/><p style=\'text-align: justify;\'>True development for the entire community is the supreme goal. Deliberate and persistent efforts to bring about Social Justice is the need of the hour. A healthy society with a great future is only possible when every aspect of human indulgence is self driven with long-term benefits accruing on every citizen.</p><br/><p style=\'text-align: justify;\'>It is the prime responsibility of an elected representative to serve the people by going beyond his means and ensure that through education and employment, the productive activities of the common man is nourished and enhanced.</p><br/><p style=\'text-align: justify;\'>The focused promotion of education, health, art and culture, along with better public amenities (Parks, recreational facilities, elder care homes, etc.)</p><br/>','Dayananad','Thu May 31 2018','blogimg1.jpg',0);

/*Table structure for table `dreddybanner` */

DROP TABLE IF EXISTS `dreddybanner`;

CREATE TABLE `dreddybanner` (
  `banner_id` int(10) NOT NULL AUTO_INCREMENT,
  `banner_image` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `dreddybanner` */

insert  into `dreddybanner`(`banner_id`,`banner_image`) values (1,'banner1.png'),(2,'banner2.png'),(3,'banner3.png'),(4,'banner4.jpg'),(10,'banner5.png');

/*Table structure for table `dreddycomments` */

DROP TABLE IF EXISTS `dreddycomments`;

CREATE TABLE `dreddycomments` (
  `commenter_id` mediumint(250) NOT NULL AUTO_INCREMENT,
  `commenter_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `commenter_email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `commenter_msg` mediumtext COLLATE utf8_unicode_ci,
  `article_id` mediumint(250) DEFAULT NULL,
  PRIMARY KEY (`commenter_id`),
  KEY `cmtarticleid` (`article_id`),
  CONSTRAINT `cmtarticleid` FOREIGN KEY (`article_id`) REFERENCES `dreddyarticle` (`article_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `dreddycomments` */

insert  into `dreddycomments`(`commenter_id`,`commenter_name`,`commenter_email`,`commenter_msg`,`article_id`) values (3,'punith','punithkumar325@gmail.com','ahvhdvhkvhkdk',2);

/*Table structure for table `dreddyfadminregiestration` */

DROP TABLE IF EXISTS `dreddyfadminregiestration`;

CREATE TABLE `dreddyfadminregiestration` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_email` varchar(255) DEFAULT NULL,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  `admin_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `dreddyfadminregiestration` */

/*Table structure for table `dreddyfeedback` */

DROP TABLE IF EXISTS `dreddyfeedback`;

CREATE TABLE `dreddyfeedback` (
  `feed_id` mediumint(255) NOT NULL AUTO_INCREMENT,
  `feedperson_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `feedperson_email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `feedperson_phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `feedperson_msg` mediumtext COLLATE utf8_unicode_ci,
  `feeddisplay_status` int(10) DEFAULT NULL,
  PRIMARY KEY (`feed_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `dreddyfeedback` */

insert  into `dreddyfeedback`(`feed_id`,`feedperson_name`,`feedperson_email`,`feedperson_phone`,`feedperson_msg`,`feeddisplay_status`) values (1,'Seema','seema@gmail.com','9738562088','Nice web site ',0);

/*Table structure for table `dreddygalareyimg` */

DROP TABLE IF EXISTS `dreddygalareyimg`;

CREATE TABLE `dreddygalareyimg` (
  `gallery_id` int(50) NOT NULL AUTO_INCREMENT,
  `gallery_img` varchar(50) DEFAULT NULL,
  `galleryimg_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`gallery_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;

/*Data for the table `dreddygalareyimg` */

insert  into `dreddygalareyimg`(`gallery_id`,`gallery_img`,`galleryimg_type`) values (1,'gallery10.jpg','Other Events'),(2,'gallery16.png','Other Events'),(3,'gallery17.png','Other Events'),(4,'gallery17.png','Other Events'),(5,'gallery18.png','Other Events'),(6,'gallery19.png','Other Events'),(7,'gallery20.png','Other Events'),(8,'gallery21.png','Other Events'),(9,'gallery22.png','Other Events'),(10,'gallery23.png','Other Events'),(11,'gallery1.jpg','political Events'),(12,'gallery4.jpg','political Events'),(13,'gallery5.jpg','political Events'),(14,'gallery7.jpg','political Events'),(15,'gallery12.png','political Events'),(16,'gallery13.png','political Events'),(17,'gallery14.png','political Events'),(18,'gallery16.png','political Events'),(19,'gallery10.jpg','Spiritual Events'),(20,'gallery32.png','Spiritual Events'),(21,'gallery33.png','Spiritual Events'),(22,'gallery34.png','Spiritual Events'),(23,'gallery35.png','Spiritual Events'),(24,'gallery36.jpg','Spiritual Events'),(25,'gallery37.jpg','Spiritual Events'),(26,'gallery38.jpg','Spiritual Events'),(27,'gallery39.jpg','Spiritual Events'),(28,'gallery1.jpg','TimeLine'),(29,'gallery2.jpg','TimeLine'),(30,'gallery3.jpg','TimeLine'),(31,'gallery4.jpg','TimeLine'),(32,'gallery5.jpg','TimeLine'),(33,'gallery6.jpg','TimeLine'),(34,'gallery7.jpg','TimeLine'),(35,'gallery8.jpg','TimeLine'),(36,'gallery9.jpg','TimeLine'),(37,'gallery10.jpg','TimeLine'),(38,'gallery6.jpg','With Leader'),(39,'gallery7.jpg','With Leader'),(40,'gallery8.jpg','With Leader'),(41,'gallery9.jpg','With Leader'),(42,'gallery10.jpg','With Leader'),(43,'gallery11.png','With Leader'),(44,'gallery12.png','With Leader'),(45,'gallery13.png','With Leader'),(46,'gallery14.png','With Leader'),(47,'gallery15.png','With Leader');

/*Table structure for table `dreddyquotes` */

DROP TABLE IF EXISTS `dreddyquotes`;

CREATE TABLE `dreddyquotes` (
  `quotes_id` mediumint(255) NOT NULL AUTO_INCREMENT,
  `quotes_image` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `quotes_msg` mediumtext COLLATE utf8_unicode_ci,
  PRIMARY KEY (`quotes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `dreddyquotes` */

insert  into `dreddyquotes`(`quotes_id`,`quotes_image`,`quotes_msg`) values (1,'quotes1.jpg','If we eradicate corruption in <br/>our nation; nobody would sleep<br/>hungry, nobody would be homeless,<br/>our government hospitals &<br/>schools would bean the private<br/>ones ,every child would be getting<br/>quality education.<br/>'),(3,'quotes3.jpg','The most powerful force against<br/>corruption is our voters, who <br/>can elect honest & responsible <br/>representatives. It is your tax <br/>paid money being robbed,<br/>please vote against corruption.<br/>');

/*Table structure for table `dreddyreplay` */

DROP TABLE IF EXISTS `dreddyreplay`;

CREATE TABLE `dreddyreplay` (
  `reply_id` mediumint(250) NOT NULL AUTO_INCREMENT,
  `replyer_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `replyer_email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `replyer_msg` mediumtext COLLATE utf8_unicode_ci,
  `comment_id` mediumint(9) DEFAULT NULL,
  `article_id` mediumint(9) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `replyarticle_id` (`article_id`),
  KEY `cmtreply_id` (`comment_id`),
  CONSTRAINT `cmtreply_id` FOREIGN KEY (`comment_id`) REFERENCES `dreddycomments` (`commenter_id`) ON DELETE CASCADE,
  CONSTRAINT `replyarticle_id` FOREIGN KEY (`article_id`) REFERENCES `dreddyarticle` (`article_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `dreddyreplay` */

insert  into `dreddyreplay`(`reply_id`,`replyer_name`,`replyer_email`,`replyer_msg`,`comment_id`,`article_id`) values (1,'seema','seema@gmail.com','dhdhvhgdcgd',3,2);

/*Table structure for table `dreddyvideos` */

DROP TABLE IF EXISTS `dreddyvideos`;

CREATE TABLE `dreddyvideos` (
  `video_id` int(50) NOT NULL AUTO_INCREMENT,
  `video_path` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`video_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `dreddyvideos` */

insert  into `dreddyvideos`(`video_id`,`video_path`) values (1,'https://www.youtube.com/embed/LaSv_INZJTM'),(2,'https://www.youtube.com/embed/hJZIRTvmSBY'),(3,'https://www.youtube.com/embed/1U2LXJ-dnn0'),(4,'https://www.youtube.com/embed/aABVU4NH5iU'),(5,'https://www.youtube.com/embed/zJ8MGAJtKaY'),(6,'https://www.youtube.com/embed/hJZIRTvmSBY'),(7,'https://www.youtube.com/embed/pq8vp79fSCk'),(8,'https://www.youtube.com/embed/hJZIRTvmSBY'),(9,'https://www.youtube.com/embed/hJZIRTvmSBY'),(14,'https://www.youtube.com/embed/hJZIRTvmSBY');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
