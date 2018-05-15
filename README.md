# EmoToast


[![](https://jitpack.io/v/imrun/EmoToast.svg)](https://jitpack.io/#imrun/EmoToast)


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.imrun:EmoToast:-SNAPSHOT'
	}
  
  
  Step 3. Implementation in Project
  
  
  For Default
  
  EmoToast.makeText(this,"This is Default Toast",EmoToast.LENGTH_LONG,EmoToast.DEFAULT,true).show();
  
  
  For Success
  
        EmoToast.makeText(this,"Success Toast !",EmoToast.LENGTH_LONG,EmoToast.SUCCESS,true).show();
  
  For Error
  
        EmoToast.makeText(this,"Error Toast",EmoToast.LENGTH_LONG,EmoToast.ERROR,true).show();
  
  For Warning
  
        EmoToast.makeText(this,"Warning Toast",EmoToast.LENGTH_LONG,EmoToast.WARNING,true).show();
  
  For Information
  
        EmoToast.makeText(this,"Infomation Toast",EmoToast.LENGTH_LONG,EmoToast.INFO,true).show();
