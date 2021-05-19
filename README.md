# IPS Solution

## _Thesis Preparation, PoC Application_

This repository holds the code for an _Android_ application capable of applying a path loss model concept to infer the distance between a device and a BLE Estimote beacon.

By applying this proximity technique, the application takes advantage of the antropological concept of proxemics to calculate the proxemic zone in which the device is from the beacon.

## Workflow

1. The application _IPS Solution_, running on a smartphone compatible with Android Marshmallow, finds the BLE Estimote beacon
2. The application, through the [Android Beacon Library], computes the distance between the smartphone and the beacon
3. The distance is transformed, through a classification process, into a proxemic zone based on the following figure.

![392743499](https://user-images.githubusercontent.com/34092072/118896303-d5ea3780-b8ff-11eb-864f-5f59b53fc3ac.png)

## Features

- Proximity classification indoor positioning system in 1 dimension
- Radio propagation model that infers the distance between two objects
- Android application compatible with version Marshmallow

## Example

The following example shows the application running on an ASUS Zenfone Live (Android Marshmallow)

https://user-images.githubusercontent.com/34092072/118895618-632c8c80-b8fe-11eb-84f2-3bc1ad8e23b0.mp4


## License

MIT License

Copyright (c) 2021 Rui Pedro Porfírio

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

   [Android Beacon Library]: <https://altbeacon.github.io/android-beacon-library/>
