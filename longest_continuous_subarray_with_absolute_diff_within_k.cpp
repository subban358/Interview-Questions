#include <bits/stdc++.h> 
using namespace std; 

#define rep(i,n)        for (i = 0; i < n; ++i) 
#define REP(i,k,n)      for (i = k; i <= n; ++i) 
#define REPR(i,k,n)     for (i = k; i >= n; --i) 
#define ff              first
#define ss              second
#define ll              long long
#define pb              push_back
#define mp              make_pair
#define pii             pair<int,int>
#define vi              vector<int>
#define mii             map<int,int>
#define pqb             priority_queue<int>
#define pqs             priority_queue<int,vi,greater<int> >
#define setbits(x)      __builtin_popcountll(x)
#define zrobits(x)      __builtin_ctzll(x)
#define mod             1000000007
#define inf             1e18
#define ps(x,y)         fixed<<setprecision(y)<<x
#define mk(arr,n,type)  type *arr=new type[n];
#define w(x)            int x; cin>>x; while(x--)

#define MAX 100000005
int arr[MAX];

void c_p_c()
{
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
	#ifndef ONLINE_JUDGE
	    freopen("in.txt", "r", stdin);
	    freopen("out.txt", "w", stdout);
	#endif
}

int main() { 

	c_p_c();

	w(t){

		int i, j, k, n, e = 0, s = 0, ans = 0;
		deque<int> maxq, minq;
		cin >> n >> k;
		rep(i, n){
			cin >> arr[i];
		}
		while(e < n){
			int x = arr[e];

			while(!minq.empty() && arr[minq.back()] >= x) minq.pop_back();
			minq.push_back(e);

			while(!maxq.empty() && arr[maxq.back()] <= x) maxq.pop_back();
			maxq.push_back(e);

			int mn = arr[minq.front()];
			int mx = arr[maxq.front()];

			if(mx - mn > k){
				s++;

				if(s > minq.front()) minq.pop_front();
				if(s > maxq.front()) maxq.pop_front();
			}
			else{
				ans = max(ans, e - s + 1);
				++e;
			}
		}

		cout << ans << endl;
	}
	
	return 0; 
} 
