# SharedPreference

SharedPreference is small collection of key-values that you'd like to save.
## Note: SharedPreferences API are for reading and writing key value pairs.
<hr />

# Get a handle to shared preferences

1. getsharedPreferences(): Use this if you need multiple shared preference files identified by name, which you specify with the first parameter. You can call this from any context in your app.
 
<h3>getsharedPreferences()</h3>
<pre><code>Context context = getActivity();
SharedPreferences sharedPref = context.getSharedPreferences(
        getString(R.string.preference_file_key), Context.MODE_PRIVATE);</code></pre>
2. getPreferences(): Use this from an Activity if you need to use only one shared preference file for the activity.
<h3>getPreferences()</h3>
<pre><code>Context context = getActivity();
SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);</code></pre>
<hr />

# Write to shared preferences:

SharedPreference.editor - to write to a share preferences file, by calling edit();
### Pass the keys and values want to write with methods such as: 
   putInt() and putString() then call apply() or commit() to save the changes.
   <pre><code>SharedPreferences sharedPreferences = getSharedPreferences("Sharedpreferencename",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username",username);
                        editor.putString("password",password);
                        editor.apply();
                        Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();</code></pre>
<hr />

# Read from shared preferences:

To Retriece values from a shared preferences file, call methods such as getInt() and getString();
<pre><code>SharedPreferences sharedPreferences = getSharedPreferences("Sharedpreferencename",MODE_PRIVATE);
                        String username,password;
                        username = sharedPreferences.getString("username","");
                        password = sharedPreferences.getString("password","");
                        textView.setText("Username: " + username + "\nPassword: " + password +"\n" );</code></pre>
 <hr />
 
 # Click The image to watch the video:

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/d_TRnGEIhX9Tk?si=621vlfl_tqewRMyb.jpg)](https://www.youtube.com/shorts/TRnGEIhX9Tk?si=621vlfl_tqewRMyb)
                        

                        
