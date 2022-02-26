# HandmadeEditTextPreferenceTest
EditTextPreferenceと同様のダイアログを自作する方法。

要点としては、
- DialogPreferenceクラスの派生クラスを作成する。
- onCreateDialogView関数をオーバーライドし、setDialogLayoutResource関数で、自作のテキスト設定ダイアログのレイアウトを設定する。
- onBindDialogView関数をオーバーライドし、プリファレンス値の読み込みを行い、ダイアログアイテムの更新を行う。
- onDialogClosed関数をオーバーライドし、OKボタンが押された場合に、プリファレンス値の保存を行う。

## Screenshots : スクリーンショット
<img src="images/Screenshot_01.png" width="256" alt="Screenshot"/> <img src="images/Screenshot_02.png" width="256" alt="Screenshot"/> <img src="images/Screenshot_03.png" width="256" alt="Screenshot"/> <img src="images/Screenshot_04.png" width="256" alt="Screenshot"/> <img src="images/Screenshot_05.png" width="256" alt="Screenshot"/>

## Requirements : 必要条件、依存関係
- Android Studio 2.3.3
- Android SDK 25
- Android Build Tools v26.0.0
- Android Support Repository

## Author : 作者
Nobuki HIRAMINE : http://www.hiramine.com

## License : ライセンス
Copyright 2018 Nobuki HIRAMINE  
The source code is licensed under the Apache License, Version 2.0.  
See the [LICENSE](LICENSE) file for more details.  
(本アプリケーションのソースコードのライセンスは、「Apache License, Version 2.0」です。  
詳細は「[LICENSE](LICENSE)」ファイルを参照ください。)
