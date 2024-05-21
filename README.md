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
3. getPreferences(): Use this from an Activity if you need to use only one shared preference file for the activity.
<hr />

# Write to shared preferences:

SharedPreference.editor - to write to a share preferences file.
