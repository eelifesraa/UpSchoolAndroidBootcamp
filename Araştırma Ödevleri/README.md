# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)



## <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

</br>

## Cevap: 
Kotlin'de değişkenler temelde val,var ve lateinit var olarak tanımlanır.
- Val degisken tipiyle tanimlanan deger uzerinde bir daha deger degisikligi yapilamaz.
- Var degisken tipi ise val tipinin tersinde gorev yapar. Var ile tanimlanan deger uzerinde degisiklik yapilabilir.
- Lateinit hemen başlatılmayan tanımlama şeklidir ve sadece tür belirtir. Hemen baslantilmadigi icin baslatilana kadar bellek uzerinde yer ayirmaz.Lateinit, var tanimlayicisiyla beraber kullanilir. Val ile kullanilmaz. Tur belirtebilmek icin ":" isarti ile birlikte kullanilir.


```
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //private lateinit var startNow:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        //startNow=findViewById(R.id.startNow)

        binding. startButton.setOnClickListener {
           val intent=Intent(this@MainActivity,StartActivity::class.java)
            startActivity(intent)
        }

    }
}
```
</br>

## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

</br>

## Cevap:

Android Studio, tools namespace yapilan tasarım uzerindeki ya da XML icinde belirtilen ozellikleri gosterir. Uygulama calistirildiginda derleme araclari bu ozellikleri kaldırır, boylece tasarimda gorunur ama uygulama calistiginda gorunmez. 

```
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

</layout>
```

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

</br>

## Cevap: 

Android 8.0 ile birlikte yazı tiplerini kullanabilmek için yeni özellik eklenmiştir. res klasörü altında font klasörü açılır ve bu dosyanın içine yazı tipleri eklenir. <font> elemeni içerisine özellikleri yazılır. fontStyle ve fontWeight değerleri verilerek oluşturulur. 
    
```
<?xml version="1.0" encoding="utf-8"?>
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    <font
        android:fontStyle="normal"
        android:fontWeight="400"
        android:font="@font/lobster_regular" />
    <font
        android:fontStyle="italic"
        android:fontWeight="400"
        android:font="@font/lobster_italic" />
</font-family>
```
    
Kullanımı bu şekildedir.
    
```
<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/lobster"/>
```
    
## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.

</br>
    
## Cevap: 

Property animation, arka plan rengi veya alpha değeri gibi nesnenin özelliklerini belirli bir süre boyunca değiştiren, XML'de tanımlanan bir animasyonlardır Res klasörü altında animator klasörü açılır ve animasyon için olusturulacak dosyalar buraya eklenir.

- Animator tagı, belirli bir süre boyunca bir animasyon gerçekleştirir.
- ObjectAnimator tagı ise belirli bir süre boyunca bir nesnenin belirli özelliğini gösterir. 

