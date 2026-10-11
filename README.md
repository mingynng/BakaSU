# MyKSU
<img align='right' src='BakaSU_Full.svg' width='220px' alt="MyKSU Icon">

**English** | [简体中文](./zh/README.md)

A personalized fork of [BakaSU](https://github.com/Baka-SU/BakaSU), with custom UI and module repo.

[![Latest CI build](https://img.shields.io/badge/CI-Build-800080)](https://github.com/mingynng/BakaSU/actions)
![Platform](https://img.shields.io/badge/Platform-Android-green.svg)
![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)

## Features (MyKSU Custom)

1. **Floating Bottom Bar**: Apple-style floating navigation bar (liquid glass effect)
2. **Modern Icons**: Outlined style icons for cleaner look
3. **Custom Module Repo**: 21 popular modules pre-configured
4. **Custom Package Name**: Can coexist with original BakaSU
5. **Based on BakaSU**: All original features included

## Original Features (from BakaSU)

1. Kernel-based `su` and root access management
2. Module system based on [metamodules](https://kernelsu.org/guide/metamodule.html)
3. [App Profile](https://kernelsu.org/guide/app-profile.html): Lock up the root power in a cage
4. Support non-GKI and GKI 1.0
5. Built-in susfs management tool
6. Multi manager support

## Compatibility Status

- Officially supports Android GKI 2.0 devices (kernel 5.10+).
- Older kernels (3.4+) are also compatible, but the kernel will have to be built manually.
- Currently, only `arm64-v8a`, `armeabi-v7a` and `X86_64` are supported.

## Installation

1. Download the APK from [Actions](https://github.com/mingynng/BakaSU/actions)
2. Install it like any normal app
3. Enjoy!

## Credit

- [BakaSU](https://github.com/Baka-SU/BakaSU): Original project
- [KernelSU](https://github.com/tiann/KernelSU): Upstream
- [SukiSU-Ultra](https://github.com/SukiSU-Ultra/SukiSU-Ultra): Fork source
- [Magisk](https://github.com/topjohnwu/Magisk): The powerful root tool

## License

- The file in the "kernel" directory is under [GPL-2.0-only](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html) license.
- Except for the files mentioned above, all other parts are under [GPL-3.0 or later](https://www.gnu.org/licenses/gpl-3.0.html) license.
