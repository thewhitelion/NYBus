/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mindorks.nybus.event;

import com.mindorks.nybus.subscriber.SubscriberHolder;

import java.lang.reflect.Method;

/**
 * Created by Jyoti on 16/08/17.
 */

public class Event {

    public Object object;
    public Object targetObject;
    public SubscriberHolder subscribedMethod;


    public Event(Object object,Object targetObject,SubscriberHolder subscribedMethod) {
        this.object = object;
        this.targetObject = targetObject;
        this.subscribedMethod = subscribedMethod;
    }

}