# SmoothRecyclerView

![](https://ibb.co/dqpa9z)

<h1 style="font-size:20%";>How do i use it ? <h1/>

## How do I use it?

### Setup

***

##### Gradle

**in gridle (App-level) add this implementation statement to the dependencies section:**


` dependencies {`
 	`implementation 'com.github.abedsako:SmoothRecyclerView:1.0.0'`
 	`}`

**in gridle (Project-level) add maven

  `allprojects {`
   	`repositories {`
  		 `maven { url 'https://jitpack.io' }`
   	`}`
   `}`

***

### Without Adding Custom Animation

    SmoothRecyclerview smoothRecyclerview = SmoothRecyclerview(this, recyclerview);
    smoothRecyclerview.SnapPosition(0);

***

### With Adding Custom Animation

    SetStartSmoothAnimation onSnap;
    SetEndSmoothAnimation onSnapOff;

    onSnap = new SetStartSmoothAnimation(1.2f, 1.2f, 1.0f, 250, 100, true, true, true);
    onSnapOff = new SetEndSmoothAnimation(1.0f, 1.0f, 0.6f, 250, 0, false, true, true);

    SmoothRecyclerview smoothRecyclerview = SmoothRecyclerview(this, recyclerview,onSnap,onSnapOff);

***

   SetStartSmoothAnimation(ScaleY, ScaleX, Alpha, Duration, StartDelay, (Boolean)WithStartDelay , (Boolean)WithScale, 
       (Boolean)WithAlpha );
