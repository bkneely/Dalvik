.. Dalvik Tutorial documentation master file, created by
   sphinx-quickstart on Mon May  6 13:43:01 2013.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

Welcome to the Dalvik Tutorial Source Page!
===========================================

This page contains some very basic instructions on how to build a .dex file. They include:

1) Download the Android SDK at `here <http://developer.android.com/sdk/>`_. Choose the "ADT Bundle" appropriate for your OS. Android SDK is the primary tool for developing all Android applications.

2) Clone the git repository for the Dalvik sample application at https://github.com/bkneely/Dalvik.git

3) Comple the sample class Simple.java (or your own Java class) using: ::

	javac Simple.java

4) Use the dx utility to build the .dex file. dx is located in the /sdk/platform-tools directory of your Android SDK install directory. Run the following::

	dx --dex --output=Simple.dex Simple.class

5) Use the dexdump utility to generate a human-readable .dex file. dexdump is also located in SDK_ROOT/sdk/platform-tools. Run the following::

	dexdump -d Simple.dex > Simple_dexdump.txt

6) Now you can explore the workings of the Dalvik Executable!

.. toctree::
   :maxdepth: 2

