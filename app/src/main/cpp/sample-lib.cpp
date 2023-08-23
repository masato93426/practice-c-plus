//
// Created by masato on 2023/06/13.
//
#include <string.h>
#include <string>
#include <jni.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_practicec_MainActivity_getMessage(
        JNIEnv* env, jobject thiz, jstring j_name
){
    const char* name = env->GetStringUTFChars(j_name, 0);
    std::string msg = "Hello ";
    msg +=  name;
    msg += " from JNI!!";
    return env->NewStringUTF(msg.c_str());
}