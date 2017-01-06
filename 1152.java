{\rtf1\ansi\ansicpg949\cocoartf1504\cocoasubrtf760
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red221\green40\blue103;\red217\green232\blue247;\red230\green230\blue250;
\red18\green144\blue195;\red249\green250\blue244;\red30\green181\blue64;\red121\green171\blue255;\red237\green127\blue72;
\red167\green236\blue33;\red141\green218\blue248;\red255\green191\blue38;\red215\green131\blue127;}
{\*\expandedcolortbl;;\csgenericrgb\c86667\c15686\c40392;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c90196\c90196\c98039;
\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c92941\c49804\c28235;
\csgenericrgb\c65490\c92549\c12941;\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c100000\c74902\c14902;\csgenericrgb\c84314\c51373\c49804;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 BufferedReader\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 IOException\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 InputStreamReader\cf4 ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 util\cf4 \ulc4 .\cf3 \ulc3 ArrayList\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 util\cf4 .\cf3 LinkedList\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 util\cf4 .\cf3 StringTokenizer\cf4 ;\
\
\cf2 public\cf3  \cf2 class\cf3  \cf5 Main\cf3  \cf6 \{\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 	\cf2 public\cf3  \cf2 static\cf3  \cf2 void\cf3  \cf7 main\cf6 (\cf5 String\cf6 []\cf3  \cf8 args\cf6 )\cf3  \cf2 throws\cf3  \cf5 IOException\cf3  \cf6 \{\cf0 \
\cf3 		\cf5 BufferedReader\cf3  \cf9 br\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf10 BufferedReader\cf6 (\cf2 new\cf3  \cf10 InputStreamReader\cf6 (\cf5 System\cf4 .\cf11 in\cf6 ))\cf4 ;\cf0 \
\cf3 		\cf5 StringTokenizer\cf3  \cf9 st\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf10 StringTokenizer\cf6 (\cf12 br\cf4 .\cf10 readLine\cf6 ())\cf4 ;\cf0 \
\cf3 		\cf5 LinkedList\cf4 <\cf13 String\cf4 >\cf3  \cf9 list\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf10 LinkedList\cf4 <\cf13 String\cf4 >\cf6 ()\cf4 ;\cf0 \
\cf3 		\cf2 while\cf6 (\cf12 st\cf4 .\cf10 hasMoreTokens\cf6 ()\cf4 !=\cf2 false\cf6 )\cf3  \cf6 \{\cf0 \
\cf3 			\cf12 list\cf4 .\cf10 add\cf6 (\cf12 st\cf4 .\cf10 nextToken\cf6 ())\cf4 ;\cf0 \
\cf3 		\cf6 \}\cf0 \
\cf3 		\cf5 System\cf4 .\cf11 out\cf4 .\cf10 println\cf6 (\cf12 list\cf4 .\cf10 size\cf6 ())\cf4 ;\cf0 \
\cf3 	\cf6 \}\cf0 \
\pard\pardeftab720\partightenfactor0
\cf6 \}}