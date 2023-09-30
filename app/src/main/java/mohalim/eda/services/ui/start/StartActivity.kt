package mohalim.eda.services.ui.start

import android.content.Context
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import mohalim.eda.services.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartActivityUI(this@StartActivity)
        }
    }
}

@Composable
fun StartActivityUI(context: Context){

    val backgroundColor = Color(parseColor("#FFF4D29C"));
    val buttonEdgeColor = Color(parseColor("#c48d37"));

    val scrollState = rememberScrollState()

    Box(modifier = Modifier
        .fillMaxSize()
        .background(backgroundColor)){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state = scrollState)
                .paint(
                    painterResource(id = R.drawable.transparent_bg),
                    contentScale = ContentScale.FillBounds
                )) {


            Image(painterResource(id = R.drawable.organization_logo), modifier = Modifier.fillMaxWidth().height(150.dp).padding(32.dp, 32.dp), contentDescription = "الإبلاغ عن الآثار الجانبية للمستحضرات والمستلزمات الطبية")



            /**
             *  Athr Ganby
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service1), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "الإبلاغ عن الآثار الجانبية للمستحضرات والمستلزمات الطبية")
                    Text(text = "الإبلاغ عن الآثار الجانبية للمستحضرات والمستلزمات الطبية", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * Tawafor
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service2), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "الاستفسار عن توافر المستحضرات الدوائية")
                    Text(text = "الاستفسار عن توافر المستحضرات الدوائية", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }

            /**
             * Mokhalfa
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service3), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "الإبلاغ عن مخالفات تخص المستحضرات أو المنشآت الصيدلية")
                    Text(text = "الإبلاغ عن مخالفات تخص المستحضرات أو المنشآت الصيدلية", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * E3lan Ghair Molaem
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service4), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "الإبلاغ عن مواد دعائية دوائية غير ملائمة")
                    Text(text = "الإبلاغ عن مواد دعائية دوائية غير ملائمة", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * Estesharat Dawaia
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service5), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "الاستفسار عن معلومات دوائية موثوقة")
                    Text(text = "الاستفسار عن معلومات دوائية موثوقة", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * Almrakez Almotnakela
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(painterResource(id = R.drawable.service6), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "خدمات المراكز المتنقلة")
                    Text(text = "خدمات المراكز المتنقلة", modifier = Modifier.fillMaxWidth(),  textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * Alakhtaa Aldwaia
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service7), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "برنامج الإبلاغ عن الأخطاء الدوائية (No HARMe)")
                    Text(text = "برنامج الإبلاغ عن الأخطاء الدوائية (No HARMe)", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * Ta7weel Almostdrat
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service8), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "تحويل المستحضرات من وصفية إلى غير وصفية")
                    Text(text = "تحويل المستحضرات من وصفية إلى غير وصفية", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }


            /**
             * Naharat Aladwia
             */
            Row (modifier = Modifier
                .padding(2.dp)
                .height(100.dp)
                .border(3.dp, buttonEdgeColor)
                .clickable{

                }
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.White),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.service9), modifier = Modifier.width(100.dp).height(100.dp), contentDescription = "إستفسارات نشرات الأدوية البشرية")
                    Text(text = "إستفسارات نشرات الأدوية البشرية", textAlign = TextAlign.Center)
                }

                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(buttonEdgeColor)
                    .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = "املأ النموذج", color = Color.White)
                    Icon(Icons.Rounded.KeyboardArrowRight, contentDescription = "Go to service")
                }

            }

        }
    }
}