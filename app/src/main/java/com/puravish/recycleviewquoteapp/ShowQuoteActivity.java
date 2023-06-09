package com.puravish.recycleviewquoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowQuoteActivity extends AppCompatActivity {

    TextView textView;

    RecyclerView recyclerView;

    ArrayList<ShowQuoteModel> categoris = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_quote);

        initView();

    }

    private void initView() {

        textView = findViewById(R.id.txtcat);
        recyclerView = findViewById(R.id.rcvshow);


        ImageView imageView = findViewById(R.id.back);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();


            }
        });


//        ShayariInterface shayariInterface1 = new ShayariInterface() {
//            @Override
//            public void onClick(String title) {
//
//                Toast.makeText(ShowQuoteActivity.this, "Copied", Toast.LENGTH_SHORT).show();
//                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//                ClipData clip = ClipData.newPlainText("quote", title);
//                clipboard.setPrimaryClip(clip);
//
//            }
//        };
//
//
//
//
//        ShayariInterface shayariInterface2 = new ShayariInterface() {
//            @Override
//            public void onClick(String title) {
//
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.setType("text/plain");
//                startActivity(sendIntent);
//
//
//            }
//        };


//        textView.setText( getIntent().getExtras().getString( "title" ));


        String title = getIntent().getExtras().getString("title");
        textView.setText(title);



        if (title.equals("Alone")) {


            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("\"The greatest journeys are often taken alone,\n" +
                    "Where solitude becomes a sanctuary of growth,\n" +
                    "Embrace the silence, for it speaks volumes,\n" +
                    "Discover the depths within your own soul.");
            categoris.add(m1);


            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("\"Alone, you find the strength to soar,\n" +
                    "Unburdened by the expectations of others,\n" +
                    "Embrace your solitude, for it reveals your truth,\n" +
                    "In the stillness, your heart finds its voice.");
            categoris.add(m2);


            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("\"Amidst the solitude, greatness awakens,\n" +
                    "A symphony of thoughts, an inner revelation,\n" +
                    "Alone, you cultivate your inner landscape,\n" +
                    "And from within, blooms a universe of possibilities.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("\"In solitude, one finds the space to dream,\n" +
                    "To dance with ideas and let creativity gleam,\n" +
                    "Alone, you're not confined but truly free,\n" +
                    "To explore the depths of your own mystery.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("\"Solitude is not a state of loneliness,\n" +
                    "But a canvas upon which self-discovery is painted,\n" +
                    "In solitude, you uncover hidden strengths,\n" +
                    "And learn to walk the path that you've created.");
            categoris.add(m5);


            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("\"In solitude, you become your own muse,\n" +
                    "Unleashing the power of your untamed thoughts,\n" +
                    "Alone, you craft your destiny's design,\n" +
                    "And rewrite the story of your life.");
            categoris.add(m6);


            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("\"Alone, you are not adrift but anchored,\n" +
                    "To the core of your being, a guiding light,\n" +
                    "Solitude whispers truths in your ear,\n" +
                    "And unveils the secrets that ignite.");
            categoris.add(m7);


            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("\"In solitude, you find the voice within,\n" +
                    "The whisper of your heart, the essence of your soul,\n" +
                    "Alone, you learn to embrace your flaws,\n" +
                    "And discover the strength to make yourself whole.");
            categoris.add(m8);


            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("\"Solitude is the breeding ground of wisdom,\n" +
                    "Where introspection births profound insight,\n" +
                    "Alone, you uncover the depths of your existence,\n" +
                    "And forge an unbreakable bond with your inner light.");
            categoris.add(m9);


            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("\"In the embrace of solitude, you find solace,\n" +
                    "A refuge from the noise, a haven for the mind,\n" +
                    "Alone, you connect with your innermost desires,\n" +
                    "And realize that within yourself, you will always find.\"");
            categoris.add(m10);

        } else if (title.equals("Attitude")) {

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("“If you look the right way, you can see that the whole world is a garden.” —Frances Hodgson Burnett");
            categoris.add(m1);


            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("“Having a positive attitude isn’t wishy-washy, it’s a concrete and intelligent way to view problems, challenges, and obstacles.” —Jeff Moore");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("“It makes a big difference in your life when you stay positive.” —Ellen DeGeneres");
            categoris.add(m3);


            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("“Building a positive attitude begins with having confidence in yourself.” —Roger Fritz");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("“A positive attitude is something everyone can work on, and everyone can learn how to employ it.” —Captain Jack Sparrow");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("\"તમારું ધ્યાન તમારા વિચારો બને છે, તમારો વિચાર તમારા કર્મો બને છે, અને તમારા કર્મો તમારી સાદગી બને છે.\"");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("“Positive thinking will let you do everything better than negative thinking.” —Zig Ziglar");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("“The most important thing you’ll ever wear is your attitude.” —Jeff Moore");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m8.setShowquotesName("“Attitude and enthusiasm play a big part in my life. I get excited about the things that inspire me. I also believe in laughing and having a good time.” —Dwayne Johnson");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("“Keep your face always toward the sunshine—and shadows will fall behind you.” — Walt Whitman");
            categoris.add(m10);


        } else if (title.equals("Angry")) {


            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("“Never go to bed mad. Stay up and fight.”\n" +
                    "― Phyllis Diller");
            categoris.add(m1);


            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("“Not my daughter, you bitch!”\n" +
                    "― J.K. Rowling, Harry Potter and the Deathly Hallows");
            categoris.add(m2);


            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("“The best fighter is never angry.”");
            categoris.add(m3);


            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("“If you spend your time hoping someone will suffer the consequences for what they did to your heart, then you're allowing them to hurt you a second time in your mind.”");
            categoris.add(m4);


            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("“Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.”");
            categoris.add(m5);


            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("“I want to commit the murder I was imprisoned for.”\n" +
                    "― J.K. Rowling, Harry Potter and the Prisoner of Azkaban");
            categoris.add(m6);


            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("“Speak when you are angry and you will make the best speech you will ever regret.”");
            categoris.add(m7);


            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("“When angry, count four. When very angry, swear.”\n" +
                    "― Mark Twain");
            categoris.add(m8);


            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("“Anger, resentment and jealousy doesn't change the heart of others-- it only changes yours.”");
            categoris.add(m9);


            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("“Anger is an acid that can do more harm to the vessel in which it is stored than to anything on which it is poured.”");
            categoris.add(m10);


        } else if (title.equals("Birthday")) {

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("\"જન્મદિન ની હાર્દિક શુભકામનાઓ! \uD83C\uDF89 તમારો વિશેષ દિવસ આનંદ, હસો, પ્રેમ થી ભરેલો હોવો. \uD83C\uDF82\uD83D\uDE0A\"");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("\"જન્મદિન ની સુંદર શુભેચ્છાઓ! \uD83E\uDD73 આ વર્ષે તમને સફળતા, સુખ, અને તમારા હૃદયના સમસ્ત ઇચ્છાઓ પૂરી થવી. \uD83C\uDF88❤️\"");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("\"જન્મદિન ની હાર્દિક શુભકામનાઓ! \uD83C\uDF1F તમારો દિવસ સૂર્ય જેવો પ્રકાશમય, રંગોનો ઉત્સવ અને એક યુનિકોર્ન જેવો જાદૂમય હોવો. \uD83C\uDF89\uD83E\uDD84\"");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("\"જન્મદિન ની વાર્મ શુભેચ્છાઓ! \uD83C\uDF82 તમારો દિવસ આશ્ચર્યજનક આશીર્વાદો, મીઠી મોમેંટો અને મહત્વાકાંક્ષાઓ થી ભરેલો હોવો. \uD83C\uDF81\uD83D\uDE04\"");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("\"જન્મદિન મુબારક! \uD83C\uDF89 આપનો વિશેષ દિવસ આનંદ, હાસ્ય, અને પ્રેમ સાથે ભરેલો હોય. \uD83C\uDF82\uD83D\uDE0A\"");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("\"શુભ જન્મદિન! \uD83E\uDD73 આ વર્ષે તમને સફળતા, સુખ, અને હૃદયના સર્વ ઇચ્છાઓ મળી જવી. \uD83C\uDF88❤️\"");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("\"હાર્દિક જન્મદિન નો આભાર! \uD83C\uDF1F તમારો દિવસ સૂર્ય જેવો પ્રકાશમય, રંગોનો ઉત્સવ અને એક યુનિકોર્ન જેવો મોજમાં બને. \uD83C\uDF89\uD83E\uDD84\"");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("\"જન્મદિન ની શુભકામનાઓ! \uD83C\uDF82 તમારો દિવસ મધુર, હસોને ભરેલો અને યાદગાર બને. \uD83C\uDF81\uD83D\uDE04\"");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("\"મહાન વ્યક્તિને જન્મદિન ની હાર્દિક શુભેચ્છાઓ! \uD83C\uDF8A આ વર્ષે તમારે અનંત સંધેશો, આનંદ, અને સત્ય સુખ મળે. \uD83C\uDF1F\uD83D\uDE0A\"");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("\"જન્મદિન મુબારક! \uD83C\uDF89 આપને જીવનમાં આનંદ, ખુશી અને પ્રેમ મળે એ શું મહત્વનું છે. \uD83C\uDF82\uD83D\uDE0A\"");
            categoris.add(m10);


        } else if (title.equals("Funny")) {

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("“You know the world is going crazy when the best rapper is a white guy, the best golfer is a black guy, the tallest guy in the NBA is Chinese, the Swiss hold the America's Cup, France is accusing the U.S. of arrogance, Germany doesn't want to go to war, and the three most powerful men in America are named \"Bush\", \"Dick\", and \"Colin.\" Need I say more?”");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("“Well, don't expect us to be too impressed. We just saw Finnick Odair in his underwear.”");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("“Going to church doesn’t make you a Christian any more than going to a garage makes you an automobile.”");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("“The planet is fine. The people are fucked.”");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("“Never go to bed mad. Stay up and fight.”");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("“I did not attend his funeral, but I sent a nice letter saying I approved of it.”");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("“What the hell is that?\" I laughed.\n" + "\"It's my fox hat.\"\n" + "\"Your fox hat?\"\n" + "\"Yeah, Pudge. My fox hat.\"");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("“Everyone should be able to do one card trick, tell two jokes, and recite three poems, in case they are ever trapped in an elevator.”");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("“It's not because I want to make out with her.\"\n" +
                    "Hold on.\" He grabbed a pencil and scrawled excitedly at the paper as if he'd just made a mathematical breakthrough and then looked back up at me. \"I just did some calculations, and I've been able to determine that you're full of shit”");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("“I came from a real tough neighborhood. Once a guy pulled a knife on me. I knew he wasn't a professional, the knife had butter on it.”");
            categoris.add(m10);


        } else if (title.equals("Helth")) {
            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("વેલો ઉઠે વીર, બળ બુદ્ધિ વધે અને સુખીયું રહે એનું શરીર – Early to bed and early to rise, makes you healthy and wise.");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("જાગ્યા ત્યાંથી સવાર – It is never too late to start doing the right thing.");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("ચોર પકડાય, ચટું પકડાય, પણ ખોટા બોલુ ના પકડાય – You can catch a thief, you can catch a selfish person but you cannot catch a liar.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("નાણું મળશે પણ ટાણું નઈ મળે – Choose time over money.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("કડવો લીંબડો અને કડવા એના બીજ, બીજ વાવતા પણ મીઠા ના થાય – As you sow so shall you reap.");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("સોના જેઉં સાસરું પણ પિયર જેઉં નહીં – The grooms house may be made of gold, but her parent’s home is priceless.");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("આવે તોહ ઘર ને જાયે તોહ રસ્તો – If you come here and we get on you’ll be welcomed, but if we don’t then you can go on on your way.");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("લાગે તો તીર નહિ તો તુક્કો – If it’s bang on the target, it was deliberate. If it didn’t it was not.");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("ટીપે ટીપે સરોવર બંધાય , કાંકરે કાંકરે પાડ બંધાય – Rome was not built in a day.");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("ના બોલવા માં નવ ગુણ – Silence is golden.");
            categoris.add(m10);


        } else if (title.equals("Positive")) {


            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("\"Happiness is not something ready-made. It comes from your own actions.\" - Dalai Lama:\n" +
                    "ખુશી કંઈ તાયાર કરેલું નથી. તે તમારી આપના ક્રિયાઓથી આવે છે.");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("\"The only limit to our realization of tomorrow will be our doubts of today.\" - Franklin D. Roosevelt:\n" +
                    "આવતા કાલની અમારી જાણીશુંં માટેની એકમાત્ર મર્યાદા આજના સંદેહો હશે.");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("\"The future belongs to those who believe in the beauty of their dreams.\" - Eleanor Roosevelt:\n" +
                    "ભવિષ્ય તેને પામે છે જેઓ તેમની સપનોની સુંદરતામાં વિશ્વાસ રાખે છે.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("\"You are never too old to set another goal or to dream a new dream.\" - C.S. Lewis:\n" +
                    "તમે ક્યારેય પણ જુવું નથી કે બીજો લક્ષ્ય સ્થાપિત કરવો અથવા નવી સપનો દેખવાનો.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("\"In the middle of every difficulty lies opportunity.\" - Albert Einstein:\n" +
                    "દિકરીની મધ્યમાં સમસ્યાનો સંધાર્ય હોય છે.");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("\"The greatest glory in living lies not in never falling, but in rising every time we fall.\" - Nelson Mandela:\n" +
                    "જીવનમાં મહાન ગૌરવ કેવી રીતે પ્રાપ્ત થાય છે, આ હમેશાં પતન ન પડતા નહીં, પતને પછીથી ઉઠવાથી છે.\n" +
                    "\n");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("\"Positive thinking will let you do everything better than negative thinking will.\" - Zig Ziglar:\n" +
                    "સકારાત્મક વિચારોની મદદથી તમે નકારાત્મક");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("\"Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence.\" - Helen Keller:\n" +
                    "આશાવાદ એ વિશ્વાસ છે જે સાધન સુધી લઈ જાય છે. આશા અને આત્મવિશ્વાસ વગર કંઈપણ થતું નથી.");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("\"The only way to do great work is to love what you do.\" - Steve Jobs:\n" +
                    "મહાન કાર્ય કરવાની એક માત્ર રહેતી હોય કે તમે જે કરો તેને પ્રેમ કરો.");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("\"Believe you can and you're halfway there.\" - Theodore Roosevelt:\n" +
                    "તમે કરી શકો અને તમે આધારે છો એમ વિશ્વાસ કરો.");
            categoris.add(m10);


        } else if (title.equals("Workout")) {


            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("\"પાત્રાને મૃદુ બનાવવા માટે જે સમાન ફૂલતો પાણી હોય છે, તે અંડોને કઠોર કરે છે. એ તમારા નિર્માણથી છે, નહીં તો પરિસ્થિતિઓથી.\"");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("\"જો અમારી રવાનગી હોય છે કે આ દિવસ શાનદાર થશે તો સામાન્ય રીતે થાય છે.\"");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("\"કઠિન પ્રશિક્ષણના દુખાને અનુભવ કરો અથવા અણધાનને. આ ચોઇસ તમારી છે.\" ");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("\"અસાધ્ય માત્ર એક મત છે.\" ");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("\"તમારી ઉત્સાહીતને તમારા ધૈર્યને માટે માંગતું છે.\"");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("\"આજે સોમવાર છે... ઉત્સાહ આપી સપના અને લક્ષ્યો આપીએ. ચાલો ચાલીએ!\"");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("\"એક સોમવાર હતો અને તેઓ સૂર્ય સુધી ટાઈટરોપે ચઢી ગયા.\" ");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("\"તેવો છે. સોમવાર. અમે ફરીથી મળીએ છીએ. અમે ક્યારેય મિત્રો નથી બનશે, પરંતુ શાયદ અમે એકસમના શત્રુતાને પાછા છૂટી ને એક વધુ સકારાત્મક સાથેને ચકાસી શકીએ.\" ");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("\"હંશિએ હંશતા રહેવાથી હું હંશતું હતું. હું માનું છું કે આ રીતે તમે વધારો થાય છો. જ્યાં કે 'આહ, મેં ખરેંચ નથી સામે વાચી શકું' આવે તેવા મોમેન્ટ્સ હોય છે અને તું તેના મોમેન્ટ્સને પાર કરે છે, ત્યારે તું પરિપાઠ પામી છે.\" ");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("\"જો તમે તમારી આંતરની આવાજ સાંભળો છો જે કહે છે, 'તું રંગ ઉઘાડી નહીં શકે,' તો કૃપા કરીને રંગ ઉઘાડો અને તે આવાજ મૂકવામાં આવશે.\" ");
            categoris.add(m10);
        } else if (title.equals("LeaderShip")) {


            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("I suppose leadership at one time meant muscles; but today it means getting along with people.");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("Leadership is an opportunity to serve. It is not a trumpet call to self-importance.");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("Show me the leader and I will know his men. Show me the men and I will know their leader.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("It is better to lead from behind and to put others in front, especially when you celebrate victory when nice things occur. You take the front line when there is danger. Then people will appreciate your leadership.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("I start with the premise that the function of leadership is to produce more leaders, not more followers.");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("True leadership lies in guiding others to success. In ensuring that everyone is performing at their best, doing the work they are pledged to do and doing it well.");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("The nation will find it very hard to look up to the leaders who are keeping their ears to the ground.");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("The man who follows a crowd will never be followed by a crowd.");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("A good leader takes a little more than his share of the blame, a little less than his share of the credit.");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("When you accept a leadership role you take on extra responsibility for your actions toward others.");
            categoris.add(m10);


        } else if (title.equals("Smile")) {


            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("The prettiest smiles hides the deepest secrets. The prettiest eyes have cried the most tears, and the kindest hearts have felt the most pain");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("Keep the smile, leave the tension, feel the joy, forget the worry, hold the peace, leave the pain, and always be happy");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("The prettiest smiles hide the deepest scars. The prettiest eyes have cried the most tears and the kindest hearts have felt the most pain");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("Keep a smile on your face and let your personality be your autograph");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("Life only comes around once, so do whatever makes you happy, and be with whoever makes you smile");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("Never stop smiling, because the eyes are the window to the soul, and the smile is the front door to your heart");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("Silence and smiles are two powerful tools. Smile is the way to solve many problems and Silence is the way to avoid many problems");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("Life is like a mirror, if you frown at it, it frowns back; if you smile, it returns the greeting");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("Silence and smiles are two powerful tools. Smile is the way to solve many problems and Silence is the way to avoid many problems");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("Always wear a smile, not because life is full a reasons to smile, but because your smile itself could be a reason for others to smile");
            categoris.add(m10);


        } else if (title.equals("Dating")) {

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("Love is like a virus. It can happen to anybody at any time.");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("There's only two people in your life you should lie to... the police and your girlfriend.");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("No man should marry until he has studied anatomy and dissected at least one woman.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("If you can lie, you can act, and if you can lie to crazy girlfriends, you can act under pressure.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("My perfect guy wears converse, is totally laid back, and doesn't worry about being cool.");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("A bachelor never quite gets over the idea that he is a thing of beauty and a boy forever.");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("I have a lot of boyfriends, I want you to write that. Every country I visit, I have a different boyfriend. And I kiss them all.");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("I hate being the heartbreaker. Hate it. If I date somebody and it doesn't work out, it's another nightmare for me.");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("My girlfriend bought me a down jacket, she said it fit my personality.");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            categoris.add(m10);
            m10.setShowquotesName("I dated dozens of young men, had fun with all, made commitments to none.");

        } else if (title.equals("Death")) {

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("The life of the dead is placed in the memory of the living.");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("Some people die at 25 and aren't buried until 75.");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("You'll have time to rest when you're dead.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("Don't send me flowers when I'm dead. If you like me, send them while I'm alive.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("“To the well-organized mind, death is but the next great adventure.”");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("“I'm the one that's got to die when it's time for me to die, so let me live my life the way I want to.”");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("“The fear of death follows from the fear of life. A man who lives fully is prepared to die at any time.”");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("“I do not fear death. I had been dead for billions and billions of years before I was born, and had not suffered the slightest inconvenience from it.”");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("“Life is for the living.\n" +
                    "Death is for the dead.\n" +
                    "Let life be like music.");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("“Things we lose have a way of coming ba");
            categoris.add(m10);

        } else if (title.equals("Failure")) {

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("\"Failure isn't fatal, but failure to change might be\" - John Wooden");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("“Success is most often achieved by those who don't know that failure is inevitable.” ");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName(" “If you're not prepared to be wrong, you'll never come up with anything original.” ");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("“If you don’t try at anything, you can’t fail… it takes back bone to lead the life you want” ");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName(" “It's failure that gives you the proper perspective on success.” ");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName(" “There is no failure except in no longer trying.”");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("“I have not failed. I've just found 10,000 ways that won't work.” ");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("“There is only one thing that makes a dream impossible to achieve: the fear of failure.” ");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName(" “Success is not final, failure is not fatal: it is the courage to continue that counts.”");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("“Success is stumbling from failure to failure with no loss of enthusiasm.” ");
            categoris.add(m10);

        } else if (title.equals("Music")) {
            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("“How is it that music can, without words, evoke our laughter, our fears, our highest aspirations?”");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("“Music is like a dream. One that I cannot hear.”");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("“Music was my refuge. I could crawl into the space between the notes and curl my back to loneliness.” ");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("“Where words fail, music speaks.”");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("“Music gives a soul to the universe, wings to the mind, flight to the imagination, and life to everything.”");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("“It’s almost charity work, what people have done, turning other people on to my music.”");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("“Music can name the unnameable and communicate the unknowable.”");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("“You have to take a deep breath, and allow the music to flow through you. Revel in it, allow yourself to awe. When you play, allow the music to break your heart with its beauty.” ");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("“If music be the food of love, play on.” ");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("“Music produces a kind of pleasure which human nature cannot do without.”");
            categoris.add(m10);


        } else if (title.equals("Nature")) {
            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("“I firmly believe that nature brings solace in all troubles.”");
            categoris.add(m1);

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("“Colors are the smiles of nature.”");
            categoris.add(m2);

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName(" In nature, nothing is perfect and everything is perfect. Trees can be contorted, bent in weird ways, and they're still beautiful.");
            categoris.add(m3);

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("Forget not that the earth delights to feel your bare feet and the winds long to play with your hair.");
            categoris.add(m4);

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("To me a lush carpet of pine needles or spongy grass is more welcome than the most luxurious Persian rug");
            categoris.add(m5);

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName(" I believe in God, only I spell it Nature.");
            categoris.add(m6);

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("Live in each season as it passes; breathe the air, drink the drink, taste the fruit, and resign yourself to the influence of the earth.");
            categoris.add(m7);

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("Study nature, love nature, stay close to nature. It will never fail you. ");
            categoris.add(m8);

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName(" Men argue. Nature acts.");
            categoris.add(m9);

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("To make a prairie it takes a clover and one bee, One clover, and a bee, And revery. The revery alone will do, If bees are few.");
            categoris.add(m10);


        }


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ShowQuoteAdapter showQuoteAdapter = new ShowQuoteAdapter(ShowQuoteActivity.this, categoris);
        recyclerView.setAdapter(showQuoteAdapter);

    }
}

/*

            ShowQuoteModel m1 = new ShowQuoteModel();
            m1.setShowquotesName("");
            categoris.add( m1 );

            ShowQuoteModel m2 = new ShowQuoteModel();
            m2.setShowquotesName("");
            categoris.add( m2 );

            ShowQuoteModel m3 = new ShowQuoteModel();
            m3.setShowquotesName("");
            categoris.add( m3 );

            ShowQuoteModel m4 = new ShowQuoteModel();
            m4.setShowquotesName("");
            categoris.add( m4 );

            ShowQuoteModel m5 = new ShowQuoteModel();
            m5.setShowquotesName("");
            categoris.add( m5 );

            ShowQuoteModel m6 = new ShowQuoteModel();
            m6.setShowquotesName("");
            categoris.add( m6 );

            ShowQuoteModel m7 = new ShowQuoteModel();
            m7.setShowquotesName("");
            categoris.add( m7 );

            ShowQuoteModel m8 = new ShowQuoteModel();
            m8.setShowquotesName("");
            categoris.add( m8 );

            ShowQuoteModel m9 = new ShowQuoteModel();
            m9.setShowquotesName("");
            categoris.add( m9 );

            ShowQuoteModel m10 = new ShowQuoteModel();
            m10.setShowquotesName("");
            categoris.add( m10 );


*/
